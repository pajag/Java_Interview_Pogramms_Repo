package PracticeTaskJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateLetter {

	

	public static void main(String[] args) {
		String str = "HelloWorld";

		List<Character> list = new ArrayList<Character>();
		List<Integer>   list2=Arrays.asList(10, 8, 8, 40, 25, 98, 98, 32, 15);
		for (char character : str.toCharArray()) {
			list.add(character);
		}
		findDuplicatebase(str.toCharArray());
		findDuplicateJava8(str);// Method 1
		findDuplicateJava8GroupingBy(str);  // Method 2
		findDuplicateJava8GroupingByAndFuction(str);// Method 3
		findDuplicateNumbersJava8(list2);
		}

	private static void findDuplicateNumbersJava8(List<Integer> list2) {
		list2.stream().filter(e-> Collections.frequency(list2, e)>1).collect(Collectors.toSet()).forEach(System.out::println);;
		
	}

//  Method 3
	private static void findDuplicateJava8GroupingByAndFuction(String str) {
		str.chars().mapToObj(ch1 -> (char) ch1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((k, v) -> {   // without <key,value> pair
		  if (v >= 2) {
		   System.out.println(k+" ");}
		 });
		
	}

//   Method 2
	private static void findDuplicateJava8GroupingBy(String str) {
		Stream<Character> charsStream = str.chars().mapToObj(ch1 -> (char) ch1); 
		Map<Character, Long>  output=charsStream.collect(Collectors.groupingBy(ch2 -> ch2, Collectors.counting())); // with <key,value> pair
		System.out.println(output);
	}

//	 Method 1
	private static void findDuplicateJava8(String str) {
		Set<Character> set = new HashSet<>();
		str.chars().mapToObj(e->(char)e).filter(ele -> !set.add(ele)).collect(Collectors.toSet()).forEach(System.out::println);
	}

	private static void findDuplicatebase(char[] ch) {
//		H,e,l,l,o,W,o,r,l,d
		int i = 0;
		int j;

		while (ch.length > i) {
			j = i + 1;
			char chars = ' ';
			while (ch.length > j) {
				if (ch[i] == ch[j]) {
					chars = ch[i];
					ch[j] = ' ';
				}
				j++;
			}
			if (chars != ' ')
				System.out.println("basic :" + chars);

			i++;
		}
	}

}
