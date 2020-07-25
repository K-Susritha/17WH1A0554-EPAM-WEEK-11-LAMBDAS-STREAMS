package com.epam.task10;

import java.util.*;
import java.util.stream.Collectors;
public class StringLetterA {
	
	public static List<String> answer(List<String> list){
		List<String> result = list.stream().filter(String->(String.length() == 3) && String.charAt(0) == 'a').collect(Collectors.toList());
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		System.out.println("Enter the list of strings:");
		List<String> list = new ArrayList<String>();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			list.add(str);
		}
		System.out.println("The required strings with length 3 and starting with a are: ");
		List<String> result = answer(list);
		result.forEach(t->System.out.println(t));
		sc.close();
	}

}