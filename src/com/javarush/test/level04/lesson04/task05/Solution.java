package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String buffer = bufferedReader.readLine();
        int value = Integer.parseInt(buffer);

        if (value > 0){
            value = value*2;
        }
        else {
            if (value < 0){
                value = value + 1;
            }
        }
        System.out.println(value);
    }

}