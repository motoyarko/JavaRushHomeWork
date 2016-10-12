package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
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

        int minValue = map.size();

        for (int value : map.values())
        {
            minValue = (minValue > value) ? value : minValue;
        }
        for (int key : map.keySet())
        {
            if (map.get(key) == minValue)
            {
                System.out.print(key + " ");
            }
        }
    }
}
