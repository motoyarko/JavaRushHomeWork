package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh()
    {
        char[] s = this.namePadezh.toCharArray();
        s[s.length-1] = 'у';
        String.valueOf(s);

        return String.valueOf(s);
    }

    public void pull(Person person)
    {
        System.out.println(this.name + " за " + person.getNamePadezh());
    }
}
