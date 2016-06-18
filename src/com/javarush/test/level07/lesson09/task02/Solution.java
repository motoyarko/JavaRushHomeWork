package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> inputString = new ArrayList<String>();
        for (int i = 0; i < 5; i++) inputString.add(bufferedReader.readLine());
        inputString.remove(2);
        for (int i = inputString.size()-1; i > -1; i--) System.out.println(inputString.get(i));

    }
}
