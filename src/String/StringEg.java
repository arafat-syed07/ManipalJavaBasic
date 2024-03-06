package String;

public class StringEg {

	public static void main(String[] args) {
		String s1 = "New Delhi";
		String s2 = "Delhi";
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.replace('D', 'Z'));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,6));
		// Split
		String[] arrofstr = s1.split(" ");
		for (String a : arrofstr) {
			System.out.println(a);
		}
	}

}
