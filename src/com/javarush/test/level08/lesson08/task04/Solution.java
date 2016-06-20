package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] Args){

        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);


    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1982"));
        map.put("Stallone3", new Date("JUNE 1 1983"));
        map.put("Stallone4", new Date("OCTOBER 1 1984"));
        map.put("Stallone5", new Date("AUGUST 1 1986"));
        map.put("Stallone6", new Date("JULY 1 1988"));
        map.put("Stallone7", new Date("MARCH 1 1981"));
        map.put("Stallone8", new Date("JANUARY 1 1980"));
        map.put("Stallone9", new Date("DECEMBER 1 1980"));
        map.put("Stallone10", new Date("OCTOBER 1 1980"));



        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
           Date date = pair.getValue();
            if((date.getMonth() == 5) || (date.getMonth() == 6) || (date.getMonth() == 7)) iterator.remove();

        }



    }
}
