package PracticeTaskJava8;

import java.util.stream.IntStream;


public class FindNumberRange0to100 {

	public static void main(String[] args) {
	IntStream.iterate(1, i->i+1).limit(100).forEach(System.out::println);;
	int result1=IntStream.iterate(1, i->i+1).limit(100).sum();
	int result2=IntStream.range(1, 10).sum();
	int result3=IntStream.rangeClosed(1, 50).sum();
    System.out.println("result1- "+result1);
    System.out.println("result2- "+result2);
    System.out.println("result3- "+result3);
    
		
	}

}
