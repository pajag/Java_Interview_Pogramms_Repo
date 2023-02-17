package PracticeTask;

public class PrintAllZerosInLast {

	public static void main(String[] args) {
		int[] arr = { 0, 10, 4, 0, 0, 38, 8, 0 };
		int[] result = new int[arr.length];
		int end = arr.length - 1;
		int m = 0;
		for (int i = 0; i < result.length; i++) {
			if (arr[i] != 0)
				result[m++] = arr[i];
			else
				result[end--] = arr[i];

		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");

		}
	}

}
