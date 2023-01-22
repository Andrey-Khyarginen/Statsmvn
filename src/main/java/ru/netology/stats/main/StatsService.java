package ru.netology.stats.main;

public class StatsService {
    public int salesAmount(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }

    public int averageAmount(int[] arr) {
        int average = 0;
        if (arr.length > 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                average = sum / arr.length;
            }
        }
        return average;
    }

    public int minSales(long[] arr) {
        int minMonth = 0;
        int month = 0;
        for (long sale : arr) {
            if (sale <= arr[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] arr) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : arr) {
            if (sale >= arr[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int underAverageSale(int[] arr) {
        int underAverage = 0;
        for (int sale : arr) {
            if (sale < averageAmount(arr)) {
                underAverage += 1;
            }
        }
        return underAverage;
    }
    public int overAverageSale(int[] arr) {
        int overAverage = 0;
        for (int sale : arr) {
            if (sale > averageAmount(arr)) {
                overAverage += 1;
            }
        }
        return overAverage;
    }
}