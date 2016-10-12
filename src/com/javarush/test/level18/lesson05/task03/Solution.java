package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName1;
        String fileName2;
        String fileName3;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = bufferedReader.readLine();
        fileName2 = bufferedReader.readLine();
        fileName3 = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);

        int count;
        if (fileInputStream.available() % 2 != 0)
        {
            count = fileInputStream.available() / 2;
            byte[] buffer1 = new byte[count + 1];
            int count2 = fileInputStream.read(buffer1);
            fileOutputStream2.write(buffer1, 0, count2);

            byte[] buffer2 = new byte[count];
            int count3 = fileInputStream.read(buffer2);
            fileOutputStream3.write(buffer2, 0, count3);

        } else
        {
            count = fileInputStream.available() / 2;
            byte[] buffer1 = new byte[count];
            int count2 = fileInputStream.read(buffer1);
            fileOutputStream2.write(buffer1, 0, count2);

            byte[] buffer2 = new byte[count];
            int count3 = fileInputStream.read(buffer2);
            fileOutputStream3.write(buffer2, 0, count3);
        }

        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();


    }
}
