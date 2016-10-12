package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName1;
        String fileName2;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = bufferedReader.readLine();
        fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0)
        {
            int count = fileInputStream.read(buffer);
        }
        fileInputStream.close();
        for (int i = buffer.length - 1; i >= 0; i--)
        {
            fileOutputStream2.write(buffer[i]);
        }
        fileOutputStream2.close();


    }
}
