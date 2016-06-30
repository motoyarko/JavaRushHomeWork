package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public static boolean sex;
        public static int age;
        public static String name;
        public static int weight;
        public static int height;
        public static boolean alive;

        public Human(boolean sex, int age, String name, int weight, int height, boolean alive)
        {
            this.sex = sex;
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.alive = alive;
        }

        public Human(boolean sex, int age, boolean alive) //child in the womb
        {
            this.sex = sex;
            this.age = age;
            this.name = "";
            this.weight = 0;
            this.height = 0;
            this.alive = alive;
        }
        public Human(boolean sex, int age, String name,  boolean alive) //child in the womb with a name
        {
            this.sex = sex;
            this.age = age;
            this.name = name;
            this.weight = 0;
            this.height = 0;
            this.alive = alive;
        }
        public Human(boolean sex, int weight, int height, boolean alive) //homeless person
        {
            this.sex = sex;
            this.age = 0;
            this.name = "";
            this.weight = weight;
            this.height = height;
            this.alive = alive;
        }
        public Human(boolean sex, boolean alive) //some familiar man
        {
            this.sex = sex;
            this.age = age;
            this.name = "";
            this.weight = 0;
            this.height = 0;
            this.alive = alive;
        }
        public Human(int age, String name, boolean alive) //child in the womb without sex
        {
            this.sex = true;
            this.age = age;
            this.name = name;
            this.weight = 0;
            this.height = 0;
            this.alive = alive;
        }
        public Human(boolean sex, String name, boolean alive) //child on the street
        {
            this.sex = sex;
            this.age = 0;
            this.name = name;
            this.weight = 0;
            this.height = 0;
            this.alive = alive;
        }
        public Human(boolean sex, int age, String name, int weight, int height) // loosed man
        {
            this.sex = sex;
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.alive = false;
        }
        public Human(boolean sex) //loosed homeless man
        {
            this.sex = sex;
            this.age = 0;
            this.weight = 0;
            this.height = 0;
            this.alive = false;
        }
        public Human(boolean sex, int age, int weight, int height, boolean alive) // human for wedding
        {
            this.sex = sex;
            this.age = age;
            this.name = "";
            this.weight = weight;
            this.height = height;
            this.alive = alive;
        }

    }
}
