package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(5d, "s");
        labels.put(6d, labels.get(5d));
        labels.put((double)2, "v");
        labels.put((double) 3f, "g");
        labels.put((double)4, "f");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
