public class ArrayListLauncher {
	public static void main(String[] args) {
		ArrayList testList = new ArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.getList();
		testList.add(5);
		testList.add(6);
		testList.add("seven");
		testList.getList();
		testList.remove(2);
		testList.getList();
		testList.add(8);
		testList.getList();
		testList.add(1, "one point five");
		testList.getList();
		/** System.out.println(testList.list[0]);
		System.out.println(testList.list[1]);
		System.out.println(testList.list[2]);
		System.out.println(testList.list[3]);
		System.out.println(testList.list[4]);
		System.out.println(testList.list[5]);
		System.out.println(testList.list);
		*/
	}
}