package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array20 = new int[20];
        int[] array10 = new int[10];
        int[] array101 = new int[10];

        for (int i = 0; i < array20.length; i++)
        {
            array20[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < array10.length; i++)
        {
            array10[i] = array20[i];
        }

        for (int i = 0; i < array101.length; i++)
        {
            array101[i] = array20[i + 10];
        }

        for (int i : array101)
        {
            System.out.println(i);
        }

    }
}
