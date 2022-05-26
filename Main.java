package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(nums);

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            }
            if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        return Arrays.asList(alice, bob);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int pair = 0;
        int occurence = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int sock = 0; sock < n; sock++) {

            countMap.putIfAbsent(ar.get(sock), 1);
            occurence = countMap.get(ar.get(sock));
            countMap.put(ar.get(sock), occurence++);

        }
        System.out.print(countMap);

        return occurence;
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightToLeft = 0;
        int leftToRight = 0;
        int i = 0;
        while (i < arr.size()) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get((arr.get(i).size() - 1) - i);
            i++;
        }
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void plusMinus(List<Integer> arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        List<Integer> zeroes = new ArrayList<>();
        for (Integer i : arr) {
            if (i > 0) {
                positives.add(i);
            }
            if (i < 0) {
                negatives.add(i);
            }
            if (i == 0) {
                {
                    zeroes.add(i);
                }
            }
        }
        System.out.println(BigDecimal.valueOf(positives.size()).divide(BigDecimal.valueOf(arr.size()), 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(negatives.size()).divide(BigDecimal.valueOf(arr.size()), 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(zeroes.size()).divide(BigDecimal.valueOf(arr.size()), 6, RoundingMode.HALF_UP));
    }
}
