package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        while (bufferedReader1.ready())
        {
            String[] words = bufferedReader1.readLine().split("\\s+");
            for (String singleString : words)
            {
                if (singleString.matches("([-]?[\\d]+)?([\\d]+[.]?[\\d]+)?"))
                {
                   bufferedWriter.write(singleString + " ");
                }

            }
        }

        bufferedReader1.close();
        bufferedWriter.close();

    }

}
