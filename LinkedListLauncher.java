public class LinkedListLauncher {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add(77);
		myList.add(13);
		myList.add(12);
		System.out.print("Iteration 1: ");
		myList.getList(); // 77, 13, 13
		myList.remove(1);
		System.out.print("Iteration 2: ");
		myList.getList();	// 77, 12
		myList.add("forty-seven");
		System.out.print("Iteration 3: ");
		myList.getList(); // 77, 12, forty-seven
		myList.add(1, "second element");
		System.out.print("Iteration 4: ");
		myList.getList(); // 77, second element, 12, 47
		myList.remove(2);
		myList.add(78);
		myList.add(14);
		myList.add(15);
		System.out.print("Iteration 5: "); // 77, second element, 47, 78, 14, 15
		myList.getList();
		myList.add(2, "third element");
		myList.add(0, "first element");
		myList.remove(1);
		System.out.print("Iteration 6: "); // first element, second element, third element, 47, 78, 14, 15
		myList.getList();
		myList.remove(0);
		System.out.print("Iteration 6: "); // second element, third element, 47, 78, 14, 15
		myList.getList();
	}	
}