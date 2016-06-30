package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> inputHashMap = new HashMap<String, Integer>();
        while (true)
        {
            int id = 0;
            String name = "";
            String reader = bufferedReader.readLine();
            if (!reader.isEmpty())
            {
                id = Integer.parseInt(reader);
            }
            else break;
            reader = bufferedReader.readLine();
            if (!reader.isEmpty())
            {
                name = reader;
            }
            else break;
            inputHashMap.put(name, id);
        }

        for (Map.Entry<String, Integer> iterator : inputHashMap.entrySet())
        {
            System.out.println(iterator.getValue() + " " + iterator.getKey());
        }
    }
}
