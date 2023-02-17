package PracticeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class SplitNineNumber {

	public static void main(String[] args) {
		double[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 0.5 };

		ArrayList<Double> list = DoubleStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);

		Double m1 = Collections.min(list.subList(0, 3));
		Double m2 = Collections.min(list.subList(3, 6));
		Double m3 = Collections.min(list.subList(6, 9));
		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(m1);
		list1.add(m2);
		list1.add(m3);
		System.out.println(Collections.min(list1));
	}

}
