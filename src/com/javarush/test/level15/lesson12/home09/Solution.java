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
import java.util.LinkedList;
import java.util.List;


public class Solution
{

    private static List<String> valuesList = new LinkedList<>();
    private static List<String> paramsList = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String link = bufferedReader.readLine();
        char[] charArray = link.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (((charArray[i] == '?') || (charArray[i] == '&')) && ((i + 1) < charArray.length))
            {
                i++;
                String tempString = "";
                while ((i < charArray.length) && (charArray[i] != '=') && (charArray[i] != '&'))
                {
                    tempString += charArray[i];
                    i++;
                }
                paramsList.add(tempString);
                if (tempString.startsWith("obj")) getThisValue(charArray, i);
                i--;
            }
        }

        for (String s : paramsList)
        {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : valuesList)
        {

                try
                {
                    alert(Double.parseDouble(s));
                }
                catch (Exception e)
                {
                    alert(s);
                }

        }
    }

    private static void getThisValue(char[] charArray, int i)
    {
        int k = i + 1;
        String tempString = "";
        while ((k < charArray.length) && ((charArray[k] != '=') && (charArray[k] != '&')))
        {
            tempString += charArray[k];
            k++;
        }
        valuesList.add(tempString);
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
