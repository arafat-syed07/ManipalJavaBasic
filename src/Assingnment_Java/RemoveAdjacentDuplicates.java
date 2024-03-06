package Assingnment_Java;

public class RemoveAdjacentDuplicates {
	public static void main(String[] args) {
		String input = "abbaca";
		String result = removeAdjacentDuplicates(input);
		System.out.println("Original string: " + input);
		System.out.println("String after removing adjacent duplicates: " + result);
	}

	public static String removeAdjacentDuplicates(String s) {
		StringBuilder result = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (result.length() == 0 || c != result.charAt(result.length() - 1)) {
				result.append(c);
			} else {
				result.deleteCharAt(result.length() - 1);
			}
		}
		return result.toString();
	}
}
