package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(name1)));
        String s;
        while ((s = bufferedReader1.readLine()) != null)
        {
            allLines.add(s);
        }

        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(name2)));
        while ((s = bufferedReader2.readLine()) != null)
        {
            forRemoveLines.add(s);
        }

        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException
    {

    }
}
