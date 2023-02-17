package PracticeTask;

public class FindSubStirngOfStringLiterls {

	public static void main(String[] args) {
		
		String str="ABCBADCDABAD";
		String subStr="BAD";
		char[] ch=str.toCharArray();
		char[] sub=subStr.toCharArray();
		int count=0, j=0;
		String temp="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==sub[j]) {
				temp=temp+sub[j];
				j++;
				if(temp.equals(subStr)) {
					count++;
					temp="";
					j=0;
				}
			}
		}
		temp="";
		j=0;
	
		for(int m=ch.length-1;m>=0;m--) {
			if(ch[m]==sub[j]) {
				temp=temp+sub[j];
				j++;
				if(temp.equals(subStr)) {
					count++;
					temp="";
					j=0;
				}
			}
		}
		System.out.println("Count Occurence "+count);
		

	}

}
