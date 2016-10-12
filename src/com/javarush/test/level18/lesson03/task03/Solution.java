package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        HashMap<Integer, Integer> map = new HashMap();
        String fileName;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            if (map.containsKey(data))
            {
                int value = map.get(data) + 1;
                map.put(data, value);
            } else map.put(data, 1);
        }
        fileInputStream.close();

        int maxValue = 0;

        for (int value : map.values())
        {
            maxValue = (maxValue < value) ? value : maxValue;
        }
        for (int key : map.keySet())
        {
            if (map.get(key) == maxValue)
            {
                System.out.print(key + " ");
            }
        }

    }
}
