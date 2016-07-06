package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader inputLine = new BufferedReader(new FileReader(fileName));
        bufferedReader.close();
        List<Integer> list = new ArrayList<Integer>();
        String line;

        while ((line = inputLine.readLine()) != null)
        {

            list.add(Integer.parseInt(line));
        }
        inputLine.close();

       Integer[] a = list.toArray(new Integer[list.size()]);



        int i, j, k, h, m=0, b=a.length;
        int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
                84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
                58548857, 157840433, 410151271, 1131376761, 2147483647 };
        while (d[m] < b) ++m;
        while (--m >= 0){
            k = d[m];
            for (i = k; i < b; i++){     // k-сортировка
                j=i;
                h=a[i];
                while ((j >= k) && (a[j-k] > h)){
                    a[j]=a[j-k];
                    j -= k;
                }
                a[j] = h;
            }
        }

        for (int ex : a)
        {
            if (ex%2 == 0){
                System.out.println(ex);
            }
        }

    }

}
