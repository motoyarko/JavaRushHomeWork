package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File fileName = new File(bufferedReader.readLine());
        bufferedReader.close();

        int counter = 0;
        String[] stringsArray;
        String string = "";
        try (FileReader fileReader = new FileReader(fileName))
        {
            while (fileReader.ready())
            {
               string = string + (char) fileReader.read();
            }
        }
        stringsArray = string.split("[., !?;:-]");
        for (String s: stringsArray){
            if (s.equals("world")) counter++;
        }
        System.out.println(counter);
    }
}
