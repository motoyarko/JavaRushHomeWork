package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        boolean result = false;
        Date dateCurrent = new Date(date);
        Date yearStartDate = new Date();
        yearStartDate.setHours(0);
        yearStartDate.setDate(1);
        yearStartDate.setMinutes(0);
        yearStartDate.setYear(dateCurrent.getYear());
        yearStartDate.setSeconds(0);
        yearStartDate.setMonth(0);


        long timeDistance = dateCurrent.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int)(timeDistance / msDay);
        if (dayCount%2 == 0)
        {
            result = false;
        }
        else result = true;

        return result;
    }
}
