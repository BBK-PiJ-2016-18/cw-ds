/**
 * A list is a collection of objects that are sorted and can be accessed by index. The first element in the list is at index 0.
 *
 * A list can store objects of any kind, and they can be of different types: Integers, Doubles, String, or even other lists. However, this list cannot store null objects.
 * 
 * There is no limit to the number of elements in the list (provided that there is free memory in the Java Virtual Machine).
 * 
 * Not all operations on a list will always be successful. For example, a programmer may try to remove an element from an empty list, or from a position where there is nothing. Since we hace not
 * covered exceptions yet, we need another mechanism to report errors. In order to do that, methods of this list will return a {@see ReturnObject} that will contain either an object or an error
 * value of the right kind (as defined in {@see ErrorMessage}). 
 * 
 * @author PiJ
 */
public class LinkedList implements List {
	
	ListElement firstElement = null;
	
	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size() {
		 int count = 0;
        ListElement nextElement = firstElement;
        while (nextElement != null) {
            count++;
            nextElement = nextElement.getNextElement();
        } 
        return count;
	}
	
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the element at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message,  encapsulated in a ReturnObject
	 */
	public ReturnObject get(int index) {
		if (this.isEmpty() == true) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnerror;
		}
		if (index < 0 || index >= this.size()) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnerror;
		}
		ListElement currentElement = this.firstElement;
		while (currentElement.getIndex() != index) {
			currentElement = currentElement.getNextElement();
		}
		ReturnObjectImpl returnobj = new ReturnObjectImpl(currentElement.getIndex());
		return returnobj;
	}

	/**
	 * Returns the elements at the given position and removes it from the list. The indeces of elements after the removed element must be updated accordingly.
	 * 
	 * If the index is negative or greater or equal than the size of the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, encapsulated in a ReturnObject
	 */
	public ReturnObject remove(int index) {
		if (this.isEmpty() == true) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnerror;
		}
		if (index < 0 || index >= this.size()) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnerror;
		}
		ListElement currentElement = this.firstElement;
		ListElement prevElement = null; // Make sure this works!
		while (currentElement.getIndex() != index) {
			prevElement = currentElement;
			currentElement = currentElement.getNextElement();
		}
		ReturnObjectImpl returner = new ReturnObjectImpl(currentElement);
		prevElement.changePointer(currentElement.getNextElement());
		while (currentElement.getNextElement() != null) {
			currentElement = currentElement.getNextElement();
			currentElement.reduceIndex();
		}
		return returner;
	}

	/**
	 * Adds an element to the list, inserting it at the given position. The indeces of elements at and after that position must be updated accordingly.
	 * 
	 * If the index is negative or greater or equal than the size of the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the request must be ignored and an appropriate error must be returned.
	 * 
	 * @param index the position at which the item should be inserted in the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful or containing an appropriate error message otherwise
	 */
	public ReturnObject add(int index, Object item) {		
		if (this.isEmpty() == true) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnerror;
		}		
		if (index < 0 || index >= this.size()) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnerror;
		}		
		if (item == null) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnerror;
		}
		
		ListElement currentElement = this.firstElement;		
				
		while (currentElement.getIndex() != index) {
			currentElement = currentElement.getNextElement();
		}
		currentElement
		ListElement newElement = new ListElement(item, currentElement.getIndex() + 1);
		currentElement.setNextElement(newElement);
		
		ReturnObjectImpl emptyReturn = new ReturnObjectImpl(null);
		return emptyReturn;
	}

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the request must be ignored and an appropriate error must be returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful or containing an appropriate error message otherwise
	 */
	public ReturnObjectImpl add(Object item) {
		if (this.isEmpty() == true) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnerror;
		}		
		if (index < 0 || index >= this.size()) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnerror;
		}		
		if (item == null) {
			ReturnObjectImpl returnerror = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnerror;
		}
		
		ListElement currentElement = this.firstElement;
		
		if (firstElement == null) {
			ListElement newElement = new ListElement(item, 0);
			this.firstElement = newElement;
		}
		else {
			while (currentElement.getNextElement() != null){
			currentElement = currentElement.getNextElement();
			}
			ListElement newElement = new ListElement(item, currentElement.getIndex() + 1);
			currentElement.setNextElement(newElement);
		}
		ReturnObjectImpl emptyReturn = new ReturnObjectImpl(null);
		return emptyReturn;
	}
}
