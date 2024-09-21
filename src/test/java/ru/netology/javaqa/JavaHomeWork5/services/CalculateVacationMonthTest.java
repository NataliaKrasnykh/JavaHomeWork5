package ru.netology.javaqa.JavaHomeWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateVacationMonthTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/finance.csv")

    public void test(int expected, int income, int expenses, int threshold) {
        CalculateVacationMonth service = new CalculateVacationMonth();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}


   // @Test
   //public void Test3Month() {
   //  int expected = 3;
   //CalculateVacationMonth service = new CalculateVacationMonth();
   //int actual = service.calculate(10000, 3000, 20000);
   //Assertions.assertEquals(expected, actual);
    //}

    //@Test
    //public void Test2Month() {
    //int expected = 2;
    //CalculateVacationMonth service = new CalculateVacationMonth();
    //int actual = service.calculate(100000, 60000, 150000);
    //Assertions.assertEquals(expected, actual);
    //}
