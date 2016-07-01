package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "string";
        Integer integer = 5;
        int i = 0;
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"qwerty", "asdfgh", "zxcvbn"};

        print(s);
        print(integer);
        print(i);
        print(intArray);
        print(stringArray);

    }

    private static void print(String[] stringArray)
    {
        System.out.println(stringArray);
    }

    private static void print(int[] intArray)
    {
        System.out.println(intArray);
    }

    private static void print(Integer integer)
    {
        System.out.println(integer);
    }

    private static void print(String s)
    {
        System.out.println(s);
    }

    private static void print(int i)
    {
        System.out.println(i);
    }

}
