package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> nullChild = new ArrayList<>();

        Human child = new Human("child1", true, 1, nullChild);
        Human child2 = new Human("child2", true, 2, nullChild);
        Human child3 = new Human("child3", false, 3, nullChild);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child);
        children.add(child2);
        children.add(child3);
        Human father = new Human("father", true, 30, children);
        Human mother = new Human("mother", false, 29, children);
        ArrayList<Human> fathersRelatives = new ArrayList<Human>();
        fathersRelatives.add(father);
        ArrayList<Human> mothersRelatives = new ArrayList<Human>();
        mothersRelatives.add(mother);
        Human grandFather = new Human("grandFather", true, 60, fathersRelatives);
        Human grandFather2 = new Human("grandFather2", true, 66, mothersRelatives);
        Human grandMother = new Human("grandMother", false, 59, fathersRelatives);
        Human grandMother2 = new Human("grandMother2", false, 64, mothersRelatives);
        System.out.println(grandFather);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);



    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public List<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
