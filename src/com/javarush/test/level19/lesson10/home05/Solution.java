package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        Pattern pattern = Pattern.compile("[0-9]+");

        while (bufferedReader.ready())
        {
            String[] inputString = bufferedReader.readLine().split(" ");
            for (String stringIterator : inputString)
            {
                Matcher matcher = pattern.matcher(stringIterator);
                if (matcher.find()) bufferedWriter.write(stringIterator + " ");
            }

        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
