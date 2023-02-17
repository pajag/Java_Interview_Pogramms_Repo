package PracticeTaskJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumTwoIndexIsEqualTarget {

	public static void main(String[] args) {

		int[] a = { 43, 7, 1, 33 };
		int target = 40;
		int[] arr1 = addTwoSumNum(a, target);
		int[] arr2 = addTwoSumNumHashtable(a, target);

		ArrayList<Integer> list1 = IntStream.of(arr1).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> list2 = IntStream.of(arr2).boxed().collect(Collectors.toCollection(ArrayList::new));

		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}

	private static int[] addTwoSumNumHashtable(int[] nums, int target) {

		HashMap<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {

				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}
		return new int[] {};

	}

	private static int[] addTwoSumNum(int[] a, int target) {
		int[] result = new int[2];
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					result[m++] = i;
					result[m] = j;
					return result;

				}

			}

		}
		return new int[] {};
	}

}
