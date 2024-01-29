package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static void plusMinus(List<Integer> arr) {
        float positive = 0, negative = 0, zero = 0;
        int arrSize = arr.size();

        for (int el : arr) {
            if (el > 0) {
                positive++;
            } else if (el < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive / arrSize);
        System.out.println(negative / arrSize);
        System.out.println(zero / arrSize);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
