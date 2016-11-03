package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/


import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName1 = args[0];
        String filename2 = args[1];

        BufferedReader bufferedReaderReadFromFile = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedReaderWriteIntoFile = new BufferedWriter((new FileWriter(filename2)));
        boolean firstWord = true;
        while (bufferedReaderReadFromFile.ready())
        {
            String[] inputStringArray = bufferedReaderReadFromFile.readLine().split(" ");
            for (String iterator : inputStringArray)
            {
                if (iterator.length() > 6)
                {
                    if (firstWord)
                    {
                        bufferedReaderWriteIntoFile.write(iterator);
                        firstWord = false;
                    } else bufferedReaderWriteIntoFile.write("," + iterator);
                }
            }
        }
        bufferedReaderReadFromFile.close();
        bufferedReaderWriteIntoFile.close();

    }
}
