package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String name, gender;
    public int age;

    public Friend(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, String gender)
    {
        this.name = name;
        this.gender = gender;
    }
}