/**
 * A functional list is a list with a few additional methods that are common in functional languages (such as Lisp, Clojure, or Haskell) to work with lists in a recursive way. 
 *
 * Not all operations on a recursive list will always be successful. For example, a programmer may try to extract the head from an empty list. Since we hace not covered exceptions yet, we need another
 * mechanism to report errors. In order to do that, methods of this list will return a {@see ReturnObject} that will contain either an object or an error value of the right kind
 * (as defined in {@see ErrorMessage}).
 * @author PiJ
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
    /**
     * Returns the element at the beginning of the list. 
     * 
     * If the list is empty, an appropriate error is returned. 
     *
     * @return a copy of the element at the beginning of the list or  an error if the list is empty.
     */
    public ReturnObjectImpl head() {
		if (this.isEmpty() == true) {
			ReturnObjectImpl error = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return error;
		}
		ReturnObjectImpl head = new ReturnObjectImpl(this.get(0).getReturnValue());
		return head;
	}

    /**
     * Returns a list with the elements in this list except the head. The elements must be in the same order. The original list must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     */
    public FunctionalLinkedList rest() {
		if (this.isEmpty() == true) {
			return this;
		}
		FunctionalLinkedList rest = new FunctionalLinkedList();
		for (int i = 1; i < this.size(); i++) {
			rest.add(this.get(i).getReturnValue());
		}
		return rest;
	}
	
	public void getHead() {
		System.out.println(this.head().getReturnValue());
	}
}
