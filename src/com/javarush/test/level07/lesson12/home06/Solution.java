package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("grandFather1", true, 50, null, null);
        Human grandFather2 = new Human("grandFather2", true, 51, null, null);
        Human grandMother1 = new Human("grandMother1", false, 52, null, null);
        Human grandMother2 = new Human("grandMother2", false, 53, null, null);
        Human father = new Human("father", true, 29, grandFather2, grandMother2);
        Human mother = new Human("mother", false, 28, grandFather1, grandMother1);
        Human child1 = new Human("child1", true, 1, father, mother);
        Human child2 = new Human("child2", false, 2, father, mother);
        Human child3 = new Human("child3", true, 3, father, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean isItMale, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = isItMale;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
