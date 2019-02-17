import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumUniqueArraySum {
	public static void main(String args[]) {
		System.out.println("Number of elements n : ");
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Set<Integer> unqArray = new HashSet<>();
		System.out.println("Enter the numbers : ");
		for (int inc = 0; inc < n; inc++) {
			int arrElement = scanner.nextInt();
			addOrUpdateElement(unqArray, arrElement);
		}
		int sum = 0;
		for (int num : unqArray) {
			sum += num;
		}
		System.out.println("Sum : " + sum);
		scanner.close();
	}

	private static void addOrUpdateElement(Set<Integer> unqArray, int arrElement) {
		if (!unqArray.contains(arrElement)) {
			unqArray.add(arrElement);
			return;
		} else {
			addOrUpdateElement(unqArray, arrElement + 1);
		}
	}
}
