package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int latinCounter = 0;
        int a;

        while ((a = fileInputStream.read()) != -1)
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
            {
                latinCounter++;
            }

        System.out.println(latinCounter);
        fileInputStream.close();

    }
}
