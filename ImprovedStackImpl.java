/**
 * An implementation of a stack with additional methods. 
 * 
 * Classes implementing this interface must use a {@see List} as the underlying data structure to store the elements on the stack. 
 * 
 * Not all operations on a stack will always be successful. For example, a programmer may try to pop an element from an empty stack. Since we hace not covered 
 * exceptions yet, we need another mechanism to report errors. In order to do that, methods of this list will return a {@see ReturnObject} that will contain 
  * either an object or an error value of the right kind (as defined in {@see ErrorMessage}).
 * 
 * @author PiJ
 */
public class ImprovedStackImpl implements ImprovedStack {
    /**
     * The data structure where the elements on the stack are stored. 
     */
    protected List internalList;

    /**
     * Creates a new abstract stack using the provided list as the underlying data structure.
     * 
     * Note: This constructor does not check whether the provided list is null. Programmers must do their own checks. If a null list is provided, a 
     * NullPointerException will be thrown at runtime as soon as any operation is attempted on the underlying list.
     * 
     * @param list the list to be used 
     */
    public ImprovedStackImpl(List list) {
		if (list == null) {
			List altList = new ArrayList();
			this.internalList = altList;
		}
		else {
			this.internalList = list;
		}
	}
	
	/**
	 * Returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	/**
	 * Returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */
	public int size() {
		return internalList.size();
	}

	/**
	 * Adds an element at the top of the stack. 
	 * 
	 * @param item the new item to be added
	 */
	public void push(Object item) {
		if (internalList.isEmpty() == true) {
			List list = new ArrayList();
			list.add(item);
			this.internalList = list;
		} else {
			internalList.add(0, item);
		}		
	}

	/**
	 * Returns the element at the top of the stack. The stack is left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the stack is empty, an appropriate error.
	 */
	public ReturnObjectImpl top() {
		if (this.isEmpty() == true) {
			ReturnObjectImpl error = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return error;
		}
		ReturnObjectImpl head = new ReturnObjectImpl(internalList.get(0).getReturnValue());
		return head;
	}

	/**
	 * Returns the element at the top of the stack. The element isc removed from the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the stack is empty, an appropriate error.
	 */
	public ReturnObjectImpl pop() {
		if (this.isEmpty() == true) {
			ReturnObjectImpl error = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return error;
		}
		ReturnObjectImpl head = new ReturnObjectImpl(internalList.get(0).getReturnValue());
		internalList.remove(0);
		return head;
	}
	/**
	 * Returns a copy of this stack with the items reversed, the top elements on the original stack is at the bottom of the new stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	public ImprovedStackImpl reverse() {
		ArrayList reversedList = new ArrayList();
		int k = internalList.size() - 1;
		for (int i = internalList.size() -1 ; i >= 0; i--) {
			reversedList.add(internalList.get(i).getReturnValue());
		}
		ImprovedStackImpl reversedStack = new ImprovedStackImpl(reversedList);
		return reversedStack;
	}

	/**
	 * Removes the given object from the stack if it is there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object) {
		for (int i = internalList.size() - 1; i >= 0; i--) {
			if (internalList.get(i).getReturnValue().equals(object)) {
				internalList.remove(i);
			}
		}
	}
	
	public void getList() {
		System.out.print("{");
		for (int i = 0; i < internalList.size(); i++) {
			System.out.print(internalList.get(i).getReturnValue() + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
	public void getReverse() {
		this.reverse().getList();
	}
}