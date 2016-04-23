package org.jnit.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxNum {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(5);
		num.add(30);
		num.add(4);
		num.add(2);
		num.add(56);
		
		Collections.sort(num);
		System.out.println(num);
		
		System.out.println("Biggest number in array is " +num.get(num.size()-1));
		System.out.println("Hi");
		System.out.println("Smallest number in array is " +num.get(0));

		
		
	}

}
