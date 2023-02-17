package PracticeTask;

public class PrintEvenOddNumberByAscDesc {

	public static void main(String[]args) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		int[] extra=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				extra[j]=arr[i];
				j++;
			}
	 }
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2 != 0) {
				extra[j]=arr[i];
				j++;
			}
	 }
		
	for (int i : extra) {
		System.out.println(i);
	}
	}
}
