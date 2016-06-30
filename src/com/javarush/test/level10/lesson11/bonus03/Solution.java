package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);


        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array)
    {

        int i, j, k, h, m=0, b=array.length;
        int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
                84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
                58548857, 157840433, 410151271, 1131376761, 2147483647 };
        while (d[m] < b) ++m;
        while (--m >= 0){
            k = d[m];
            for (i = k; i < b; i++){     // k-сортировка
                j=i;
                h=array[i];
                while ((j >= k) && (array[j-k] > h)){
                    array[j]=array[j-k];
                    j -= k;
                }
                array[j] = h;
            }
        }
    }
}

