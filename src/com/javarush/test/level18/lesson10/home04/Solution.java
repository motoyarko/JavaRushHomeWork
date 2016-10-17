package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader1 = new FileReader(filename1);
        FileWriter fileWriterTemp = new FileWriter(filename1 + "tmp");

        int counter;

        while ((counter = fileReader1.read()) != -1)
        {
            fileWriterTemp.write(counter);
        }
        fileWriterTemp.close();
        fileReader1.close();
        FileWriter fileWriter1 = new FileWriter(filename1);
        FileReader fileReader2 = new FileReader(filename2);
        while ((counter = fileReader2.read()) != -1)
        {
            fileWriter1.write(counter);
        }
        fileReader2.close();
        FileReader fileReaderTemp = new FileReader(filename1 + "tmp");
        while ((counter = fileReaderTemp.read()) != -1)
        {
            fileWriter1.write(counter);
        }
        fileReaderTemp.close();
        fileWriter1.close();


    }
}
