package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName;
        int maxByte = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0){
            int data = inputStream.read();
            maxByte = (maxByte < data) ? data : maxByte;
        }
        inputStream.close();
        System.out.println(maxByte);


    }
}
