package com.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsExamples {
    public static void main(String[] args) {

        // toUpperCase
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();
        System.out.println("----------------------------");
        // Filtering and Collecting
        List<String> stringFilter = Arrays.asList("abc", "", "def", "bcd", "def", "ghij");
        List<String> filtered = stringFilter.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(filtered);

        System.out.println("------------------");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squareList = numbers.stream()
                .map(i -> i * i)
                .distinct()
                .toList();

        System.out.println(squareList);

        // Sorting elements of a stream
        List<String> sortedString=stringFilter.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println("Sorted Strings"+sortedString);

        // Reduction Operations
        List<Integer> numbersReductions=Arrays.asList(1,2,3,4,5,5);
        int sum=numbersReductions.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);

        //Counting number of elements

        long count= numbersReductions.size();
        System.out.println(count);

        long stringCount=stringFilter.stream().filter(s -> !s.isEmpty())
                .count();
        System.out.println(stringCount);


        // finding first element
        String firstNonEmpty=stringFilter.stream().filter(s-> !s.isEmpty())
                .findFirst()
                .orElse("No non-empty String found");
        System.out.println(firstNonEmpty);
        String findAnyString=stringFilter.stream().filter(s-> !s.isEmpty())
                .findAny()
                .orElse("No non empty AnyString");
        System.out.println(findAnyString);


    }
}
