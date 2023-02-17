package PracticeTask;

public class RotateGivenIndexValue {

	public static void main(String[]args) {
		int[] arr= {4,3,1,5,2,34};
		int index=0, j=0;
		int[] extra=new int[arr.length];
		int i;
		for(i=0;i<arr.length-1;i++) {
		  if(i == index) {
			for(int k=i;k<arr.length-1;k++) {
				extra[j]=arr[k+1];
				j++;
			 }
			i=0;
			for(int m=i;m<arr.length;m++) {
				if(extra[j]==0) {
					extra[j]=arr[m];
					if(j++==extra.length-1) {
						break;
					}
				}
			}
			break;
		  }
	
        }
		for (int l : extra) {
			System.out.println(l);
		}
	}
}
