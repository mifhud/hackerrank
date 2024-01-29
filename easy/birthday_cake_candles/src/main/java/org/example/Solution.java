package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        for (int candle : candles) {
            if (candle > max) {
                max = candle;
            }
        }

        int result = 0;
        for (int candle: candles) {
            if (candle == max) {
                result++;
            }
        }

        return result;
    }

    public static int birthdayCakeCandlesSolution2(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int result = 0;

        for (int candle : candles) {
            if (candle == max) {
                result++;
            }
            if (candle > max) {
                result = 1;
                max = candle;
            }
        }

        return result;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(
                        bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
