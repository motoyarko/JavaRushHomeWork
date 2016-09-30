package com.javarush.test.level17.lesson10.bonus01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if(args.length>0)
        {
            if (args[0].equals("-c") && args.length==4)
            {
                if (args[2].equals("ж"))
                {
                    allPeople.add(Person.createFemale(args[1], new Date(args[3])));
                } else
                    allPeople.add(Person.createMale(args[1], new Date(args[3])));
                System.out.println(allPeople.size()-1);
            }
            if (args[0].equals("-u") && args.length==5)
            {
                if (args[3].equals("ж"))
                {
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], new Date(args[4])));
                } else
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], new Date(args[4])));
            }
            if (args[0].equals("-d") && args.length==2)
            {
                if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE)){

                        allPeople.set(Integer.parseInt(args[1]), Person.createFemale(null, null));
                    } else
                        allPeople.set(Integer.parseInt(args[1]), Person.createMale(null, null));
                }
            }
            if (args[0].equals("-i") && args.length==2)
            {
                int id = Integer.parseInt(args[1]);
                if (allPeople.get(id).getSex().equals(Sex.MALE))
                {
                    System.out.println(allPeople.get(id).getName() + " " + "м" + " " + date.format(allPeople.get(id).getBirthDay()));
                } else
                {
                    System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + date.format(allPeople.get(id).getBirthDay()));
                }
            }
        }
    }

