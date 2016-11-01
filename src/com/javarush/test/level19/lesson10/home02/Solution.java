package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        HashMap<String, BigDecimal> hashMap = new HashMap();
        BigDecimal maxValue = new BigDecimal("0");
        while (bufferedReader.ready())
        {
            String[] s = bufferedReader.readLine().split(" ");
            String key = s[0];
            BigDecimal readedValue = new BigDecimal(s[1]);

            if (hashMap.containsKey(key))
            {
                readedValue = hashMap.get(key).add(readedValue);
                hashMap.put(key, readedValue);
            } else hashMap.put(key, readedValue);
            if (readedValue.compareTo(maxValue) == 1) maxValue = readedValue;

        }
        bufferedReader.close();

        for (Map.Entry<String, BigDecimal> entry : hashMap.entrySet())
        {
            if (entry.getValue().compareTo(maxValue) == 0) System.out.println(entry.getKey());
        }

    }
}
