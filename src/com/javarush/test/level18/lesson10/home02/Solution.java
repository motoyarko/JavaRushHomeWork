package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int allSymbols = fileInputStream.available();
        int spacesCounter = 0;
        int counter;
        while ((counter = fileInputStream.read()) != -1){
            if (counter == 32) spacesCounter++;
        }
        fileInputStream.close();

        float output = ((float) spacesCounter / allSymbols ) * 100;
        System.out.format("%.2f%n" , output);
    }
}
