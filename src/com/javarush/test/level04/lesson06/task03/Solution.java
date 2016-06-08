package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static int min2(int x1, int x2){
        if (x1 < x2)
            return x1;
        else
            return x2;
    }
    public static int max2(int x1, int x2){
        if (x1 < x2)
            return x2;
        else
            return x1;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        int min = Solution.min2(Solution.min2(a, b), c);
        int max = Solution.max2(Solution.max2(a, b), c);
        int mid = 0;
        if ((a != min) && (a != max)) mid = a;
        if ((b != min) && (b != max)) mid = b;
        if ((c != min) && (c != max)) mid = c;
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
