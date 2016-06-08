package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;

        for (int i = 0 ; i < 4; i++)
        {
            String stringA = bufferedReader.readLine();
            int a = Integer.parseInt(stringA);
            if (a > max){
                max = a;
            }
        }
        System.out.println(max);
    }
}
