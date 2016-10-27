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
/*      Странно, но это решение не принял валидатор
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File fileName = new File(bufferedReader.readLine());
        bufferedReader.close();

        int counter = 0;
        String[] stringsArray;
        String string = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName)))
        {
            while (fileReader.ready())
            {
               string = string + (char) fileReader.read();
            }
        }catch (IOException e){

        }

        stringsArray = string.split("\\p{Punct}|\\p{Space}|\\p{Blank}");
        for (String s: stringsArray){
            if (s.equals("world")) counter++;
        }
        System.out.println(counter);*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        FileReader fileReader = new FileReader(fName);
        BufferedReader reader1 = new BufferedReader(fileReader);
        int count = 0;
        while (reader1.ready()){
            String[] words = reader1.readLine().split("\\W+");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("world")){
                    count++;
                }
            }
        }
        reader1.close();
        reader.close();
        fileReader.close();
        System.out.println(count);
        fileReader.close();
    }
}
