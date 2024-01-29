package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;
        for (int el : arr) {
            totalSum += el;
            if (el < min) {
                min = el;
            }
            if (el > max) {
                max = el;
            }
        }

        System.out.println((totalSum - max) + " " + (totalSum - min));
    }

    public static void miniMaxSumSolution2(List<Integer> arr) {
        long[] m = new long[arr.size()];
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            m[i] = sum - arr.get(i);
        }

        long min = m[0];
        long max = m[0];

        for (int k = 1; k < arr.size(); k++) {
            if (m[k] < min) {
                min = m[k];
            }
            if (m[k] > max) {
                max = m[k];
            }
        }

        System.out.print(min + " " + max);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
