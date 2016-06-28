package com.javarush.test.level09.lesson11.home04;

import com.sun.org.apache.xerces.internal.impl.dv.xs.MonthDayDV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
//import java.time.Month;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(bufferedReader.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.US);
        System.out.println(simpleDateFormat.format(date).toUpperCase());

    }
}
