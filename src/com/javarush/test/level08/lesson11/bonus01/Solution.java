package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String month = bufferedReader.readLine();
        char[] ch = month.toCharArray();
        ch[0] = Character.toString(ch[0]).toUpperCase().charAt(0);
        month = String.valueOf(ch);
        Date date = new Date(month + " 1 1");
        System.out.println(month + " is " + (date.getMonth() + 1) + " month");


    }

}
