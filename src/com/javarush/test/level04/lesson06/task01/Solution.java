package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringA = bufferedReader.readLine();
        String stringB = bufferedReader.readLine();
        int a = Integer.parseInt(stringA);
        int b = Integer.parseInt(stringB);

        if (a < b){
            System.out.println(a);
        }
        else {

                System.out.println(b);

        }

    }
}