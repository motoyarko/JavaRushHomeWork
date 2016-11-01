package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args)
    {
        PrintStream printStreamOriginal = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream tempPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(tempPrintStream);
        testString.printSomething();
        System.setOut(printStreamOriginal);
        String inputString = byteArrayOutputStream.toString();
        inputString = inputString.replaceAll("[\\r\\n]", "");
        String[] s1 = inputString.split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[2]);
        String operator = s1[1];
        if (operator.equals("+"))
        {
            System.out.println(inputString + (a + b));
        }
        if (operator.equals("-"))
        {
            System.out.println(inputString + (a - b));
        }
        if (operator.equals("*"))
        {
            System.out.println(inputString + (a * b));
        }

    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("3 + 6 = ");
        }
    }
}

