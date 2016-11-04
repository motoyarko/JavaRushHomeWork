package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/
//http://info.javarush.ru/JavaRush_tasks_discussion/2016/02/14/level19-lesson10-bonus01-%D0%93%D1%80%D0%B0%D1%84%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5-%D0%BF%D0%BE%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D1%83%D1%81%D0%BB%D0%BE%D0%B2%D0%B8%D1%8F-%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B8-.html
public class Solution
{
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader readFileFromConcole = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = readFileFromConcole.readLine();
        String fileName2 = readFileFromConcole.readLine();
        readFileFromConcole.close();

        BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader bufferedReaderFile2 = new BufferedReader(new FileReader(fileName2));

        while (bufferedReaderFile1.ready() && bufferedReaderFile2.ready())
        {
            String stringFile1 = bufferedReaderFile1.readLine();
            String stringFile2 = bufferedReaderFile2.readLine();
            if (stringFile1.equals(stringFile2))
            {
                lines.add(new LineItem(Type.SAME, stringFile1));
            } else if ((stringFile1.length() == 0) && (stringFile2.length() > 0))
            {
                lines.add(new LineItem(Type.ADDED, stringFile2));
            } else if ((stringFile1.length() > 0) && (stringFile2.length() == 0))
            {
                lines.add(new LineItem(Type.REMOVED, stringFile1));
            }

        }


    }


    public static enum Type
    {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem
    {
        public Type type;
        public String line;

        public LineItem(Type type, String line)
        {
            this.type = type;
            this.line = line;
        }


    }
}
