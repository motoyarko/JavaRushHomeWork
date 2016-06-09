package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(bufferedReader.readLine());
        int value2 = Integer.parseInt(bufferedReader.readLine());
        int value3 = Integer.parseInt(bufferedReader.readLine());

        if ((value1 < value2 && value2 < value3) || (value1 > value2 && value2 > value3)){
            System.out.println(value2);
        }
        if ((value2 < value1 && value1 < value3) || (value2 > value1 && value1 > value3)){
            System.out.println(value1);
        }
        if ((value1 < value3 && value3 < value2) || value1 > value3 && value3 > value2){
            System.out.println(value3);
        }




    }
}
