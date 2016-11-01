package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        TreeMap<String, BigDecimal> treeMap = new TreeMap();
        while (bufferedReader.ready())
        {
            String[] s = bufferedReader.readLine().split(" ");
            String key = s[0];
            BigDecimal readedValue = new BigDecimal(s[1]);
            if (treeMap.containsKey(key))
            {
                readedValue = treeMap.get(key).add(readedValue);
                treeMap.put(key, readedValue);
            } else treeMap.put(key, readedValue);
        }
        bufferedReader.close();

        for (Map.Entry<String, BigDecimal> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue().doubleValue());
        }

    }
}
