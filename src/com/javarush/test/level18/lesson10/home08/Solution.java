package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputFromConsole;
        while (!(inputFromConsole = bufferedReader.readLine()).equals("exit"))
        {
            ReadThread readThread = new ReadThread(inputFromConsole);
            readThread.start();
        }
        bufferedReader.close();


    }

    public static class ReadThread extends Thread
    {
        private String fileName;

        public ReadThread(String fileName)
        {
            this.fileName = fileName;
        }

        public void run()
        {

            try
            {
                FileInputStream fileReader = new FileInputStream(this.fileName);
                Map<Integer, Integer> map = new HashMap<>();
                int input;
                while ((input = fileReader.read()) != -1)
                {
                    if (map.containsKey(input))
                    {
                        int tempValue = map.get(input) + 1;
                        map.put(input, tempValue);
                    } else map.put(input, 1);
                }
                fileReader.close();
                int maxByte = 0, maxValue = Integer.MIN_VALUE;
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext())
                {
                    Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>) iterator.next();
                    if (pair.getValue() > maxValue)
                    {
                        maxValue = pair.getValue();
                        maxByte = pair.getKey();
                    }
                }
                resultMap.put(fileName, maxByte);
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
}
