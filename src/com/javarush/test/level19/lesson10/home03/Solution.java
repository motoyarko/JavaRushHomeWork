package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution
{
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        Pattern pattern = Pattern.compile("\\d+");


        while (bufferedReader.ready())
        {
            String inputString = bufferedReader.readLine();
            StringBuffer stringBuffer = new StringBuffer(inputString);
            Matcher matcher = pattern.matcher(stringBuffer);
            int beginIndexOfDate = matcher.find() ? matcher.start() : 0;
            String name = inputString.substring(0, beginIndexOfDate - 1);
            String[] dateString = inputString.substring(beginIndexOfDate).split(" ");

            int year = Integer.parseInt(dateString[2]);
            int month = Integer.parseInt(dateString[1]) - 1;
            int date = Integer.parseInt(dateString[0]);
            Date birthDate = new Date(year, month, date);
            PEOPLE.add(new Person(name, birthDate));
        }
        bufferedReader.close();


    }

}
