/**
 * An implementation of a stack that uses a {@List} as the underlying data structure.
 * 
 * Not all operations on a stack will always be successful. For example, a programmer may try to pop an element from an empty stack. Since we hace not covered 
 * exceptions yet, we need another mechanism to report errors. In order to do that, methods of this list will return a {@see ReturnObject} that will contain
 *  either anobject or an error value of the right kind (as defined in {@see ErrorMessage}).
 * 
 * @author PiJ
 */
public class StackImpl extends AbstractStack {
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
    public StackImpl(List list) {
		super(list);
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
		internalList.add(0, item);
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
}

