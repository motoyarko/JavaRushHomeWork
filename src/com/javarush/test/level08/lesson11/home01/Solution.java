package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Cat> copy = new HashSet<Cat>();
        copy = cats;
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext()){
            cats.remove(iterator.next());
        }

        //System.out.println(cats.size());

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> setCat = new HashSet<Cat>();
        setCat.add(new Cat());
        setCat.add(new Cat());
        setCat.add(new Cat());
        return setCat;
    }

    public static void printCats(Set<Cat> cats)
    {
        System.out.println(cats);
    }


    public static class Cat{
        String name;


    }

    // пункт 1
}
