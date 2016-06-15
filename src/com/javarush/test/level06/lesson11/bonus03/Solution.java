package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());
        int sub;
//5
        if (n1 > n2) {
            sub = n1;
            n1 = n2;
            n2 = sub;
        }
        if (n2 > n3) {
            sub = n2;
            n2 = n3;
            n3 = sub;
        }
        if (n3 > n4) {
            sub = n3;
            n3 = n4;
            n4 = sub;
        }
        if (n4 > n5) {
            sub = n4;
            n4 = n5;
            n5 = sub; //максимум
        }
//4
        if (n1 > n2) {
            sub = n1;
            n1 = n2;
            n2 = sub;
        }
        if (n2 > n3) {
            sub = n2;
            n2 = n3;
            n3 = sub;
        }
        if (n3 > n4) {
            sub = n3;
            n3 = n4;
            n4 = sub; //#4
        }
//3
        if (n1 > n2) {
            sub = n1;
            n1 = n2;
            n2 = sub;
        }
        if (n2 > n3) {
            sub = n2;
            n2 = n3;
            n3 = sub; //#3
        }
//2, 1
        if (n1 > n2) {
            sub = n1;
            n1 = n2;
            n2 = sub; //#2
        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }


}
