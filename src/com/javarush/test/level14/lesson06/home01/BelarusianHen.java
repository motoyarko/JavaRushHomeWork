package com.javarush.test.level14.lesson06.home01;

/**
 * Created by antonenko on 7/7/2016.
 */
public class BelarusianHen extends Hen
{


    public int getCountOfEggsPerMonth()
    {
        return 200;
    }
    public String getDescription()
    {
        String out = (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");

        return out;
    }
}