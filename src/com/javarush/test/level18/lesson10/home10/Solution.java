package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileList = new ArrayList<String>();
        String fileName;
        while (!(fileName = bufferedReader.readLine()).equals("end"))
        {
            int partNumber = Integer.parseInt(fileName.substring(fileName.lastIndexOf(".part")) + 5);
            fileList.add(partNumber - 1, fileName);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter(fileName.substring(0, fileName.lastIndexOf(".part")));
        ListIterator<String> iter = fileList.listIterator();
        while (iter.hasNext()){
            FileReader fileReader = new FileReader(iter.next());
           int counter;
            while ((counter = fileReader.read()) != -1)
            {
                fileWriter.write(counter);
            }
            fileReader.close();
        }
        fileWriter.close();

    }
}
