public class FunctionalLinkedListLauncher {
	public static void main(String[] args) {
		FunctionalLinkedList myList = new FunctionalLinkedList();
		//System.out.print("head: " + myList.head());
		System.out.print("rest: ");
		myList.rest().getList(); 
		myList.add("one");
		//System.out.print("head: " + myList.head());
		System.out.print("rest: ");
		myList.rest().getList(); 
		myList.add("two");
		//System.out.print("head: " + myList.head());
		System.out.print("rest: ");
		myList.rest().getList(); 
		myList.add("three");
		//System.out.print("head: " + myList.head());
		System.out.print("rest: ");
		myList.rest().getList(); 
		myList.add("four");
		myList.add("five");
		myList.add("six");
		//System.out.print("head: " + myList.head());
		System.out.print("rest: ");
		myList.rest().getList(); 
	}
}