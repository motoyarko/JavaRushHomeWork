package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "9";
        Zerg zerg0 = new Zerg();
        zerg0.name = "0";

        Protos protos = new Protos();
        protos.name = "0";
        Protos protos1 = new Protos();
        protos1.name = "1";
        Protos protos2 = new Protos();
        protos2.name = "2";
        Protos protos3 = new Protos();
        protos3.name = "3";
        Protos protos4 = new Protos();
        protos4.name = "4";


        Terran terran = new Terran();
        terran.name = "0";
        Terran terran1 = new Terran();
        terran1.name = "1";
        Terran terran2 = new Terran();
        terran2.name = "2";
        Terran terran3 = new Terran();
        terran3.name = "3";
        Terran terran4 = new Terran();
        terran4.name = "4";
        Terran terran5 = new Terran();
        terran5.name = "5";
        Terran terran6 = new Terran();
        terran6.name = "6";
        Terran terran7 = new Terran();
        terran7.name = "7";
        Terran terran8 = new Terran();
        terran8.name = "8";
        Terran terran9 = new Terran();
        terran9.name = "9";
        Terran terran10 = new Terran();
        terran10.name = "10";
        Terran terran11 = new Terran();
        terran11.name = "11";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}