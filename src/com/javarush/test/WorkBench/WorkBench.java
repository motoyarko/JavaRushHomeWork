package com.javarush.test.WorkBench;

/**
 * Created by antonenko on 10/26/2016.
 */
public class WorkBench
{
    public static void main(String[] args){


        String phone = "668551614";
        String code = "38";
        while (phone.length() < 10)
        {
            phone = "0" + phone;
        }

        StringBuffer out = new StringBuffer();
        out.append("+" + code + phone);
        out.insert(3, "(");
        out.insert(7, ")");
        out.insert(11, "-");
        out.insert(14, "-");
        System.out.println(out.toString());
    }
}
