package PracticeTaskJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintAllZerosInLast {

	public static void main(String args[]) {

		int[] arr = { 1, 0, 3, 0, 5, 6, 0 };
		
		PrintAllZerosInLastUsingJava8_Method(arr);
		PrintAllZerosInLastUsingJava_Method(arr);
		PrintAllZerosInLastUsingHashMap_Method(arr);
	}

	private static void PrintAllZerosInLastUsingHashMap_Method(int[] arr) {
		IntStream result = Arrays.stream(arr).filter(d -> d != 0).unordered();

		result.forEach(System.out::println);
	}

	private static void PrintAllZerosInLastUsingJava8_Method(int[] arr) {

		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

		Collections.sort(list, Comparator.reverseOrder());
		System.out.print("Java8Method : \n");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	private static void PrintAllZerosInLastUsingJava_Method(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j = 0, m = arr1.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)

				arr1[m--] = arr[i];

			else
				arr1[j++] = arr[i];

		}
		System.out.print("JavaMethod : \n");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");

		}
	}
}

//		 //outer try block   
//		  try{    
//		  //inner try block 1  
//		    try{   
//		    	   
//		     System.out.println("going to divide by 0");    
//		     int b =39/0; 
//		   }  
//		    //catch block of inner try block 1  
//		    catch(ArithmeticException e)  
//		    {  
//		      System.out.println(e);  
//		    }    
//		       
//		    
//		    //inner try block 2  
//		    try{    
//		    int a[]=new int[5];    
//		  
//		    //assigning the value out of array bounds  
//		     a[5]=4;    
//		     }  
//		  
//		    //catch block of inner try block 2  
//		    catch(ArrayIndexOutOfBoundsException e)  
//		    {  
//		       System.out.println(e);  
//		    }    
//		  
//		      
//		    System.out.println("other statement");    
//		  }  
//		  //catch block of outer try block  
//		  catch(Exception e)  
//		  {  
//		    System.out.println("handled the exception (outer catch)");  
//		  }    
//		    
//		  System.out.println("normal flow..");    
//		 