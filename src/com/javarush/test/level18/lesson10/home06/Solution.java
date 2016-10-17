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
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        HashMap<Byte, Integer> valuesMap = new HashMap<Byte, Integer>();
        byte counter;
        while ((counter = (byte) fileReader.read()) != 0){
            if (valuesMap.containsKey(counter)){
                int oldValue = valuesMap.get(counter);
                valuesMap.put(counter, oldValue + 1);
            }else valuesMap.put(counter, 1);
        }
        fileReader.close();

        Byte[] b = (Byte[]) valuesMap.keySet().toArray();
        Arrays.sort(b);

        for (byte coun : b){
            System.out.println(coun + " " + valuesMap.get(coun));
        }

    }
}
