package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
        String fileName;
        while (!(fileName = bufferedReader.readLine()).equals("exit"))
        {
            new ReadThread(fileName).start();
        }
        bufferedReader.close();


    }

    public static class ReadThread extends Thread
    {
        private final String fileName;

        public ReadThread(String fileName)
        {
            this.fileName = fileName;
        }

        @Override
        public void run()
        {
            try
            {
                FileReader fileReader = new FileReader(fileName);
                int maxValue = 0, maxKey = 0;
                Map<Integer, Integer> map = new HashMap<Integer, Integer>();
                int counter;
                while ((counter = fileReader.read()) != -1)
                {
                    if (map.containsKey(counter))
                    {
                        int tempValue = map.get(counter);
                        map.put(counter, tempValue + 1);
                    } else map.put(counter, 1);
                }
                fileReader.close();
                for (int count : map.keySet())
                {
                    if (map.get(count) > maxValue)
                    {
                        maxValue = map.get(count);
                        maxKey = count;
                    }

                }


                synchronized (resultMap)
                {
                    resultMap.put(fileName, maxKey);
                }


            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
            catch (IOException e)
            {
                System.out.println("IO Exception");
            }
        }

    }
}
