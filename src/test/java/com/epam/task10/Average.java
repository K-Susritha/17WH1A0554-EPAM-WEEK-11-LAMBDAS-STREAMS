package com.epam.task10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Average{

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics statistics = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Average of all numbers : " + statistics.getAverage());
	}
}