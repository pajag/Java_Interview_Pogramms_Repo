package PracticeTaskJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintEvenOddNumberByAscDesc {

	public static void main(String[] args) {

		int[] arr = { 8, 3, 5, 4, 2, 1, 7, 6, 9, 0 };

		PrintEvenFollowByOddJavaMethod(arr);
		PrintEvenFollowByOddJavaMethodSingleLoop(arr);
		PrintEvenByOddJava8Method(arr);

	}

	private static void PrintEvenFollowByOddJavaMethod(int[] arr) {
		int[] extra = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				extra[j] = arr[i];
				j++;
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 != 0) {
				extra[j] = arr[i];
				j++;
			}
		}

		for (int i : extra) {
			System.out.print(i + " ");
		}
	}

	private static void PrintEvenByOddJava8Method(int[] arr) {
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

		// method 1
		list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		;
		list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
		;

		// method 2
		Collections.sort(list, Comparator.comparingInt(n -> Math.floorMod(n, 2)));

		list.forEach(System.out::println);
	}

	private static void PrintEvenFollowByOddJavaMethodSingleLoop(int[] arr) {

		int[] extra = new int[arr.length];
		int m = arr.length - 1;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				extra[j++] = arr[i];

			} else {
				extra[m--] = arr[i];

			}
		}
		System.out.print(", ");
		for (int i : extra) {

			System.out.print(i + " ");
		}

	}

}
