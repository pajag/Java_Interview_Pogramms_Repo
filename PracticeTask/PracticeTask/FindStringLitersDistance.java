package PracticeTask;

public class FindStringLitersDistance {

	public static void main(String[] args) {
		String[] words = {"geeks", "for","geeks","practice","contribute","java"};
		String w1 = "for";
		String w2 = "practice";
		int dist=0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(w1)) {
                for(int j=i+1;j<words.length;j++){
                	
                	if(!words[j].equals(w2) && !words[j].equals(w1)) {
                		dist++;
                	}
                }
			}
		}
		System.out.println(dist);
	}
   
}
