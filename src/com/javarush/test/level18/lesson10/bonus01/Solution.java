package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String methodFlag = args[0];
        String fileName = args[1];
        String fileOutputname = args[2];
        if (methodFlag.equals("-e")) Encript.encription(fileName, fileOutputname);
        if (methodFlag.equals("-d")) Encript.decription(fileName, fileOutputname);


    }

    private static class Encript
    {
        public static void encription(String fileName, String fileOutputName) throws IOException
        {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fileOutputName);
            int readValue;
            while ((readValue = fileReader.read()) != -1)
            {
                fileWriter.write(readValue);
                fileWriter.write(3);
            }
            fileReader.close();
            fileWriter.close();
        }

        public static void decription(String fileName, String fileOutputName) throws IOException
        {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fileOutputName);
            int readValue;
            while ((readValue = fileReader.read()) != -1)
            {
                fileWriter.write(readValue);
                try
                {
                    fileReader.read();
                }
                catch (IOException e)
                {

                }
            }
            fileReader.close();
            fileWriter.close();
        }
    }

}
