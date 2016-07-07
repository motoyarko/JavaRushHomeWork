package com.javarush.test.level14.lesson06.home01;

/**
 * Created by antonenko on 7/7/2016.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 100;
    }
    public String getDescription()
    {
        String out = (super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");

        return out;
    }
}