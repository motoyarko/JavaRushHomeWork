package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();
        bufferedReader.close();

        FileWriter fileWriter1 = new FileWriter(filename1);
        FileReader fileReader2 = new FileReader(filename2);
        FileReader fileReader3 = new FileReader(fileName3);

        int counter;
        while ((counter = fileReader2.read()) != -1){
            fileWriter1.write(counter);
        }
        fileReader2.close();
        while ((counter = fileReader3.read()) != -1){
            fileWriter1.write(counter);
        }
        fileReader3.close();
        fileWriter1.close();


    }
}
