package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] Args)
    {

        System.out.println(getCountTheSameFirstName(createMap(), "Александр"));
        System.out.println(getCountTheSameLastName(createMap(), "Андреев"));
    }


        public static HashMap<String, String> createMap()
        {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Андреев", "Александр");
            hashMap.put("Аседова", "Елизавета");
            hashMap.put("Валинуров", "Александр");
            hashMap.put("Гаранян", "Елизавета");
            hashMap.put("Горинова", "Александр");
            hashMap.put("Ермохин", "Елизавета");
            hashMap.put("Иванов", "Александр");
            hashMap.put("Ильин", "Елизавета");
            hashMap.put("Капитонов", "Александр");
            hashMap.put("Клинова", "Елизавета");
            return hashMap;
        }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count2 = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) count2++;
        }
        return count2;

    }
}
