package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = sumSales(sales);
        int average = sum / (sales.length);
        return average;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthsOfSalesBelowAverage(int[] sales) {
        int average = averageSales(sales);

        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int monthsOfSalesAboveAverage(int[] sales) {
        int average = averageSales(sales);

        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }

}
