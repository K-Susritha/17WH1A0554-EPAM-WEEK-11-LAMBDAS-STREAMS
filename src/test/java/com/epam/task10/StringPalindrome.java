package com.epam.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors; 
public class StringPalindrome { 
	
	public static List<String> answer(List<String> list){
		int i = 0;
		List<String> result = list.stream().filter(String->(String.charAt(i) == String.charAt(String.length()-i-1))).collect(Collectors.toList());
		return result;
		
	}
	
    public static void main(String args[]) { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n = sc.nextInt();
    	System.out.println("Enter the list of strings:");
    	List<String> list = new ArrayList<String>();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			list.add(str);
		}
		System.out.println("The list of palindromes are:");
		List<String> result = answer(list);
		result.forEach(t->System.out.println(t));
		sc.close();
    } 
} 
