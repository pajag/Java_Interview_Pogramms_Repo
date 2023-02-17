package PracticeTask;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumTwoIndexIsEqualTarget {

	public static void main(String[] args) {

		int[] a = { 3, 3 };
		int target = 6;
		int[] arr = addTwoSumNum(a, target);

		ArrayList<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);
	}

	private static int[] addTwoSumNum(int[] a, int target) {
		int[] result = new int[2];
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(i + " " + j);
					result[m++] = i;
					result[m] = i;
					break;
				}

			}

		}
		return result;
	}

}
