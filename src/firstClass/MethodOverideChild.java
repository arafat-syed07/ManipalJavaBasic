package firstClass;

public class MethodOverideChild extends MethodOverideParent{
	String color = "red";

	
	public static void main(String args[]) {
		MethodOverideChild obj = new MethodOverideChild();
		System.out.println(obj.color);
	}

}
