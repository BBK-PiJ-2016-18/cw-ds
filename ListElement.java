/** This class was created to facilitate linking each element in the LinkedList to the next element, and to give each element an index
*/
public class ListElement {
	private Object element;
	private int index;
	private ListElement nextElement;
	
	/** Constructor for adding a new element at the end of the list
	*/
	public ListElement(Object element, int index) {
		this.element = element;
		this.index = index;
		this.nextElement = null;
	}
	
	/** Constructor for adding a new element before the end of the list
	*/
	public ListElement(Object element, int index, ListElement nextElement) {
		this.element = element;
		this.index = index;
		this.nextElement = nextElement;
	}
	
	public Object getElement() {
		return this.element;
	}
	
	public ListElement getNextElement() {
		return this.nextElement;
	}	
	
	public void setNextElement(ListElement nextElement) {
		this.nextElement = nextElement;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	/** This method is used when an element is removed to fix the indexes of the elements after the deleted element */
	
	public void reduceIndex() {
		this.index--;
	}
	
	/** This method is used when an element is added in the middle of the list to fix the indexes of the elements after the inserted element */
	
	public void increaseIndex() {
		this.index++;
	}
	
	/**public void deleteElement() {
		ListElement currentElement = this.firstElement;
		while (currentElement.getIndex() != this.index) {
			ListElement prevElement = currentElement;
			currentElement = currentElement.getNextElement();
		}
		ListElement deletedElement = currentElement;
		prevElement.nextElement = deletedElement.getNextElement();
		while (currentElement.getNextElement() != null) {			
			currentElement = currentElement.getNextElement();
			currentElement.index = currentElement.getIndex() - 1;
		}
	} */
}