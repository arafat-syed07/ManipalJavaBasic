package Assingnment_Java;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		System.out.println("Enter the characters to remove: ");
		String charsToRemove = sc.nextLine();
		String result = removeCharacters(input, charsToRemove);
		System.out.println("Result: " + result);
	}

	public static String removeCharacters(String input, String charsToRemove) {
		StringBuilder result = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (!charsToRemove.contains(String.valueOf(c))) {
				result.append(c);
			}
		}

		return result.toString();
	}
}