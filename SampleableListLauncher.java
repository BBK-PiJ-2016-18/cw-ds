public class SampleableListLauncher {
	public static void main(String[] args) {
		SampleableListImpl myList = new SampleableListImpl();
		myList.sample().getList();
		myList.add(77);
		myList.sample().getList(); // 77
		myList.add(13);
		myList.sample().getList(); // 77
		myList.add(12);
		System.out.print("Iteration 1: ");
		myList.getList(); // 77, 13, 12
		myList.sample().getList(); // 77, 12
		myList.remove(1);
		System.out.print("Iteration 2: ");
		myList.getList();	// 77, 12
		myList.add("forty-seven");
		System.out.print("Iteration 3: ");
		myList.getList(); // 77, 12, forty-seven
		myList.add(1, "second element");
		System.out.print("Iteration 4: ");
		myList.getList(); // 77, second element, 12, forty-seven
		myList.remove(2);
		myList.add(78);
		myList.add(14);
		myList.add(15);
		System.out.print("Iteration 5: "); // 77, second element, forty-seven, 78, 14, 15
		myList.getList();
		myList.add(2, "third element");
		System.out.print("Iteration 6: "); // 77, second element, third element, forty-seven, 78, 14, 15
		myList.getList();
		myList.add(0, "first element");
		System.out.print("Iteration 7: "); // first element, 77, second element, third element, forty-seven, 78, 14, 15
		myList.getList();
		myList.remove(1);
		System.out.print("Iteration 8: "); // first element, second element, third element, forty-seven, 78, 14, 15
		myList.getList();
		myList.remove(0);
		System.out.print("Iteration 9: "); // second element, third element, forty-seven, 78, 14, 15
		myList.getList();
		myList.add(5, 1899);
		System.out.print("Iteration 10: "); //  // second element, third element, forty-seven, 78, 14, 1899, 15
		myList.getList();
		System.out.print("Iteration 10: "); //  // second element, forty-seven, 14, 1899
		myList.sample().getList();
	}	
}