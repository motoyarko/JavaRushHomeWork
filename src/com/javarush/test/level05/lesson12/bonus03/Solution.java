package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int count = Integer.parseInt(reader.readLine());

        if (count > 0)
        {
            for (int i = 0; i < count; i++)
            {
                if (i == 0)
                {
                    maximum = Integer.parseInt(reader.readLine());
                } else
                {
                    int temp = Integer.parseInt(reader.readLine());
                    maximum = maximum > temp ? maximum : temp;
                }
            }
        }


        System.out.println(maximum);
    }
}
