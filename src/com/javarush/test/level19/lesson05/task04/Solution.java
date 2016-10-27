package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
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
            String words = bufferedReader1.readLine();//.split("\\s+");
            //words.replaceAll("[.]", "!");
            System.out.println(words);
            System.out.println(words.replaceAll("\\u002e+", "\u0021"));
            bufferedWriter.write(words.replaceAll("\\u002e+", "\u0021"));


        }

        bufferedReader1.close();
        bufferedWriter.close();
    }
}
