package com.wyb.java8.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Colletor 用于合并Stream的元素处理结果 它可以用于返回一个字符串列表
 * 
 * Java 8引入了用于统计的Collector来计算Stream处理完成后的所有统计数据
 * 
 * @author Administrator
 *
 */
public class CollectorStream {

	public static void main(String[] args) {

		// Colletor 用于合并Stream的元素处理结果 它可以用于返回一个字符串列表
		List<String> strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List:" + filtered);

		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged String: " + mergedString);

		// Java 8引入了用于统计的Collector来计算Stream处理完成后的所有统计数据

		List<Integer> numbers = Arrays.asList(2, 3, 3, 2, 5, 3, 7);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List:" + stats.getMax());
		System.out.println("Lowest number in List:" + stats.getMin());
		System.out.println("Sum of all numbers :" + stats.getSum());
		System.out.println("Average of all numbers:" + stats.getAverage());
	}
}
