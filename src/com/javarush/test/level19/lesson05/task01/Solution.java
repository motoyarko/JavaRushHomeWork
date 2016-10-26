package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File filename1 = new File(bufferedReader.readLine());
        File filename2 = new File(bufferedReader.readLine());
        bufferedReader.close();

        try (FileReader fileReader = new FileReader(filename1);
             FileWriter fileWriter = new FileWriter(filename2))
        {
            boolean flag = false;
            while (fileReader.ready())
            {
                int data = fileReader.read();
                if (flag)
                {
                    fileWriter.write(data);
                    flag = false;
                } else flag = true;
            }

        }
        catch (IOException e)
        {

        }

    }
}
