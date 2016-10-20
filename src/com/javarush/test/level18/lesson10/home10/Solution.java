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
import java.util.Iterator;
import java.util.TreeSet;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileList = new TreeSet<>();
        String fileName;

        while (!(fileName = bufferedReader.readLine()).equals("end"))
        {

            fileList.add(fileName);
        }
        bufferedReader.close();

        int partStartIndex = Integer.parseInt(String.valueOf(fileList.first().lastIndexOf(".part")));
        String fileOut = fileList.first().substring(0, partStartIndex);

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));
        Iterator<String> iter = fileList.iterator();
        while (iter.hasNext())
        {
            BufferedReader fileReader = new BufferedReader(new FileReader(iter.next()));
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

