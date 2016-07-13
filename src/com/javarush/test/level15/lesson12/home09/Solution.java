package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String url = reader.readLine();
            reader.close();
            String s = url.substring(url.indexOf("?") + 1);
            String[] m = s.split("&");
            List<String> values = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < m.length; i++)
            {
                if (m[i].contains("="))
                {
                    String[] parvalue = m[i].split("=");
                    if (parvalue[0].equals("obj"))
                    {
                        stringBuilder.append(parvalue[0] + " ");
                        values.add(parvalue[1]);
                    } else stringBuilder.append(parvalue[0] + " ");
                } else if (m[i].equals("obj"))
                {
                    stringBuilder.append(m[i] + " ");
                    values.add("");
                } else stringBuilder.append(m[i] + " ");
            }
            System.out.print(stringBuilder.toString().trim() + '\n');
            for (String v : values)
            {

                try
                {
                    alert(Double.parseDouble(v));
                }
                catch (NumberFormatException e)
                {
                    alert(v);
                }

            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}