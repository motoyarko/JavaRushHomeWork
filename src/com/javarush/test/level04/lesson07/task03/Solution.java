package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(bufferedReader.readLine());
        int value2 = Integer.parseInt(bufferedReader.readLine());
        int value3 = Integer.parseInt(bufferedReader.readLine());

        if (value1 > 0 && value2 > 0 && value3 > 0){
            System.out.println(3);
        }
        if ((value1 > 0 && value2 > 0 && value3 <= 0) || (value1 > 0 && value2 <= 0 && value3 > 0) || (value1 <= 0 && value2 > 0 && value3 > 0)){
            System.out.println(2);
        }
        if ((value1 > 0 && value2 <= 0 && value3 <= 0) || (value1 <= 0 && value2 <= 0 && value3 > 0) || (value1 <= 0 && value2 > 0 && value3 <= 0)){
            System.out.println(1);
        }
        if ((value1 <= 0 && value2 <= 0 && value3 <= 0)){
            System.out.println(0);
        }
    }
}
