package PracticeTaskJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstUniqueCharofString {

	

	public static void main(String[] args) {
		String str="erdde";
		
		JaveMethod(str);
		Java8Method(str);
		JavaListAndSetMethod(str);
		JavaLinkedHashMapMethod(str);

	}

	private static void JavaListAndSetMethod(String str) {		 
		 List<Character> list=new ArrayList<>();
		 
			for (Character ch : str.toCharArray()) {
				if (list.contains(ch)) {
					list.remove(ch);
				} else {
					list.add(ch);
				}
			}
			System.out.println("JavaListAndSetMethod : " +list.get(0));
	}

	private static void Java8Method(String str) {

		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		System.out.println("Java8Method using : "+map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey());
	}

	private static void JavaLinkedHashMapMethod(String str) {		
		/*
		 * The Major Difference between the HashMap and LinkedHashMap is the ordering of
		 * the elements. The LinkedHashMap provides a way to order and trace the
		 * elements. Comparatively, the HashMap does not support the ordering of the
		 * elements. In LinkedHashMap, if we iterate an element, we will get a key in
		 * the order in which the elements were inserted.
		 */      
	   HashMap<Character, Integer> map=new LinkedHashMap<>();
      for (Character ch : str.chars().mapToObj(e->(char)e).collect(Collectors.toList())) {
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}else {
			map.put(ch,map.get(ch)+1);
		}
	}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("JavaLinkedHashMapMethod : "+"key : "+entry.getKey()+" "+"val : "+entry.getValue());
				break;
			}
		}
	}

	
	private static void JaveMethod(String str) {

		char[] ch = str.toCharArray();
		int[] repeat = new int[ch.length];
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j]=' ';
					
				}
			}
			if(ch[i]!=' ') {
				repeat[i] = count;

			}
		}
		
		/*
		 * for (int m = 0; m < repeat.length;m++) { System.out.println(repeat[m]); }
		 */
		for (int k = 0; k < repeat.length;k++) {
			if(repeat[k] == 1) {
				System.out.println("JaveMethod : "+"Index : " + k + " " + "Value : " +ch[k]);
				break;
		    }
		}
		}

}
