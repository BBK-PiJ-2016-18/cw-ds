public class Launcher {
	public static void main(String[] args) {
		String str = "Donald John Trump";
		ReturnObjectImpl returner = new ReturnObjectImpl(str);
		System.out.println(returner.getReturnValue());
		System.out.println(returner.hasError());
		System.out.println(returner.getError());
		ErrorMessage error = ErrorMessage.EMPTY_STRUCTURE;
		ReturnObjectImpl returner2 = new ReturnObjectImpl(error);
		System.out.println(returner2.getReturnValue());
		System.out.println(returner2.hasError());
		System.out.println(returner2.getError());
		ErrorMessage error2 = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		ReturnObjectImpl returner3 = new ReturnObjectImpl(error2);
		System.out.println(returner3.getReturnValue());
		System.out.println(returner3.hasError());
		System.out.println(returner3.getError());
		ErrorMessage error3 = ErrorMessage.INVALID_ARGUMENT;
		ReturnObjectImpl returner4 = new ReturnObjectImpl(error3);
		System.out.println(returner4.getReturnValue());
		System.out.println(returner4.hasError());
		System.out.println(returner4.getError());
	}
}