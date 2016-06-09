package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int negative = 0;
        int positive = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(bufferedReader.readLine());
        if (value1 > 0){
            positive++;
        }
        if (value1 < 0){
            negative++;
        }


        int value2 = Integer.parseInt(bufferedReader.readLine());
        if (value2 > 0){
            positive++;
        }
        if (value2 < 0){
            negative++;
        }

        int value3 = Integer.parseInt(bufferedReader.readLine());
        if (value3 > 0){
            positive++;
        }
        if (value3 < 0){
            negative++;
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
       /* if (value1 > 0 && value2 > 0 && value3 > 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 3");
        }
        if ((value1 > 0 && value2 > 0 && value3 < 0) || (value1 > 0 && value2 < 0 && value3 > 0) || (value1 < 0 && value2 > 0 && value3 > 0)){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        }
        if ((value1 > 0 && value2 < 0 && value3 < 0) || (value1 <= 0 && value2 < 0 && value3 > 0) || (value1 < 0 && value2 > 0 && value3 < 0)){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        }
        if ((value1 < 0 && value2 < 0 && value3 < 0)){
            System.out.println("количество положительных чисел: 3");
            System.out.println("количество положительных чисел: 0");
        }
        if ((value1 == 0 && value2 == 0 && value3 == 0)){
            System.out.println("количество положительных чисел: 0");
            System.out.println("количество положительных чисел: 0");
        }
*/
    }
}
