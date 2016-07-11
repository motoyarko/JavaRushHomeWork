package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(bufferedReader.readLine());
        int a2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(gcd_1(a1, a2));

    }

    public static int gcd_1(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd_1(b, a % b);
    }

}
