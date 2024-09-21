package ru.netology.javaqa.JavaHomeWork5.services;

public class CalculateVacationMonth {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0; // баланс
        int VacationMonth = 0; // количество месяцев отдыха
        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) { // порог баланса для отдыха
                balance = (balance - expenses)/3; // баланс после расходов и расходов на отдых
                VacationMonth++;
            } else {
                balance = balance + income - expenses; // баланс в рабочем месяце
            }
        }
        return VacationMonth;
    }
}