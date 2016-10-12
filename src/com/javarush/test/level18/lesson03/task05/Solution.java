package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<Integer, Integer> hashMap = new HashMap();

        String fileName;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            hashMap.put(data, 1);
        }
        fileInputStream.close();

        List<Integer> list = new LinkedList<>(hashMap.keySet());
        Collections.sort(list);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
    }
}
