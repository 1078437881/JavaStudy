package com.wyb.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsPrimer {

	public static void main(String[] args) {

		// 使用forEach方法输出10个随机数
		// limit:用于减少Stream的大小
		// sorted:对Stream排序
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		// 用map方法输出唯一的某个数的平方
		List<Integer> numbers = Arrays.asList(2, 3, 2, 3, 5, 2, 7);
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);

		// filter:过滤满足条件的元素
		List<String> strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "lmn");
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		// parallelStream是Stream用于并行处理的一种替代方案
		long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("空字符串的个数: " + count);

	}
}
