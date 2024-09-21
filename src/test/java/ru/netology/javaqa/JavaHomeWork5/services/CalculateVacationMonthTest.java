package ru.netology.javaqa.JavaHomeWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateVacationMonthTest {

    @Test
    public void Test3Month() {
        int expected = 3;
        CalculateVacationMonth service = new CalculateVacationMonth();
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test2Month() {

        int expected = 2;
        CalculateVacationMonth service = new CalculateVacationMonth();
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}