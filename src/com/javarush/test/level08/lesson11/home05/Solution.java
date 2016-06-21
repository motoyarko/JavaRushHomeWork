package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();

        if (c[0] != ' ') c[0] = Character.toString(s.toCharArray()[0]).toUpperCase().charAt(0);
        for (int i = 1; i < c.length - 1; i++)
        {
            if (c[i - 1] == ' ')
            {
                c[i] = Character.toString(c[i]).toUpperCase().charAt(0);
            }

        }


        s = String.valueOf(c);
        System.out.println(s);


    }


}
