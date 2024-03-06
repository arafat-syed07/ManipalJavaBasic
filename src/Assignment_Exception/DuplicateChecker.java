package Assignment_Exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class DuplicateChecker {
	public static void main(String[] args) throws DuplicateNumberException {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> uniqueNumbers = new HashSet<>();
		System.out.println("Enter a list of integers (separated by spaces): ");
		String input = scanner.nextLine();
		scanner.close();
		String[] numbersStr = input.split(" ");
		for (String numberStr : numbersStr) {
			int number = Integer.parseInt(numberStr);
			if (!uniqueNumbers.add(number)) {
				throw new DuplicateNumberException("Duplicate number found: " + number);
			}
		}
		System.out.println("No duplicate numbers!");
	}
}
