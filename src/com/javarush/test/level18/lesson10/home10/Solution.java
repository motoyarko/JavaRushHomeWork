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
import java.util.ListIterator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileList = new ArrayList<String>(100);
      for (int i = 0; i < 100; i++){
          fileList.add(" ");
      }
        fileList.add(null);
        String fileName;
        while (!(fileName = bufferedReader.readLine()).equals("end"))
        {
            int partStartIndex = Integer.parseInt(String.valueOf(fileName.lastIndexOf(".part")));
            int partNumber = Integer.parseInt(fileName.substring(partStartIndex + 5));
            fileList.set(partNumber - 1, fileName);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("C:\\DEVELOP\\tmp\\лекции по тестированию.part11.rar");
                //fileName.substring(0, Integer.parseInt(String.valueOf(fileName.lastIndexOf(".part")))));
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
//C:\DEVELOP\tmp\лекции по тестированию.part11
/*
C:\DEVELOP\tmp\лекции по тестированию.part11
        C:\DEVELOP\tmp\лекции по тестированию.part10
        C:\DEVELOP\tmp\лекции по тестированию.part09
        C:\DEVELOP\tmp\лекции по тестированию.part08
        C:\DEVELOP\tmp\лекции по тестированию.part07
        C:\DEVELOP\tmp\лекции по тестированию.part06
        C:\DEVELOP\tmp\лекции по тестированию.part05
        C:\DEVELOP\tmp\лекции по тестированию.part04
        C:\DEVELOP\tmp\лекции по тестированию.part03
        C:\DEVELOP\tmp\лекции по тестированию.part02
        C:\DEVELOP\tmp\лекции по тестированию.part01*/
