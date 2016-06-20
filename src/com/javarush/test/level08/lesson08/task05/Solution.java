package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] Args){
        //System.out.println(createMap());

        removeTheFirstNameDuplicates(createMap());

    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> createMap= new HashMap<String, String>();
        createMap.put("Андреев", "Александр");
        createMap.put("Аседова", "Елизавета");
        createMap.put("Валинуров", "Vasya");
        createMap.put("Гаранян", "Елизавета");
        createMap.put("Горинова", "Александр");
        createMap.put("Ермохин", "Елизавета");
        createMap.put("Иванов", "Александр");
        createMap.put("Ильин", "Елизавета");
        createMap.put("Капитонов", "Александр");
        createMap.put("Клинова", "Елизавета");
        return createMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> doubleNames = new ArrayList<String>();
        HashMap<String, String> copyOfMap = new HashMap<String, String>(map);
        /*copyOfMap = map;*/

        for (Map.Entry<String, String> pair: copyOfMap.entrySet()){
            if (Collections.frequency(copyOfMap.values(), pair.getValue()) > 1){
                /*if (Collections.frequency(doubleNames, pair.getValue()) == 0)*/doubleNames.add(pair.getValue());
            }
        }
       // System.out.println(doubleNames);

        for (String doubleName: doubleNames)removeItemFromMapByValue(map, doubleName);



    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        System.out.println(map);
    }
}
