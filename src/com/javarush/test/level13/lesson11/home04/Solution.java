package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/


import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        OutputStream outputStream = new FileOutputStream(fileName);
        while (true)
        {
            String outputString = bufferedReader.readLine();
            if (!outputString.equals("exit")){
                char[] outCharArray = outputString.toCharArray();
                for (char a : outCharArray){
                    outputStream.write(a);
                }
                outputStream.write(System.getProperty("line.separator").getBytes());

            }else{

                char[] outCharArray = outputString.toCharArray();
                for (char a : outCharArray){
                    outputStream.write(a);
                }
                break;
            }
        }
        bufferedReader.close();
        outputStream.close();
    }
}
