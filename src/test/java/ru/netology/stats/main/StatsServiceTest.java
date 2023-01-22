package ru.netology.stats.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();

        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actualDay = service.salesAmount(arr);

        Assertions.assertEquals(expected, actualDay);
    }
    @Test
    public  void averageAmount() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(arr);
        Assertions.assertEquals(expected, actual);
    }
   @Test
    public void minSales(){
        StatsService service = new StatsService();
        long[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actualMin = service.minSales(arr);
        Assertions.assertEquals(expected, actualMin);
    }
    @Test
    public void maxSales(){
        StatsService service = new StatsService();
        long[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actualMax = service.maxSales(arr);
        Assertions.assertEquals(expected, actualMax);
    }
    @Test
    public void underAverageSale(){
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actualUnderAverage = service.underAverageSale(arr);
        Assertions.assertEquals(expected, actualUnderAverage);
    }
    @Test
    public void overAverageSale(){
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actualOverAverage = service.overAverageSale(arr);
        Assertions.assertEquals(expected, actualOverAverage);
    }
}

