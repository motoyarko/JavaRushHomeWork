package com.javarush.test.level07.lesson04.task04;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++)
        {
            arrayInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] arrayInt2 = new int[10];
        int k = 9;
        for (int i : arrayInt)
        {

            arrayInt2[k] = i;
            k -= 1;
        }
        for (int i : arrayInt2)
        {
            System.out.println(i);
        }

    }
}
