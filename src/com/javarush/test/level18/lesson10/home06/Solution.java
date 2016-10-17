package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        HashMap<Integer, Integer> valuesMap = new HashMap<>();
        int counter;
        while ((counter = (byte) fileReader.read()) != -1)
        {

            if (valuesMap.containsKey(counter))
            {
                int oldValue = valuesMap.get(counter);
                valuesMap.put(counter, oldValue + 1);
            } else valuesMap.put(counter, 1);
        }
        fileReader.close();


        Object[] b = valuesMap.keySet().toArray();

        Arrays.sort(b);

        for (Object coun : b)
        {

            System.out.println((char) (int) coun + " " + valuesMap.get(coun));
        }

    }
}
