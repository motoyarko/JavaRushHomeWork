package com.javarush.test.WorkBench;

/**
 * Created by antonenko on 10/26/2016.
 */
public class WorkBench
{
    public static void main(String[] args){


        String phone = "";
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


        String phoneNumber = phone;
        String nulls = "";
        if (phoneNumber.length()<10){
            for (int i = 0; i < (10 - phoneNumber.length()); i++)
            {
                nulls = nulls + "0";
            }
            phoneNumber = nulls + phoneNumber;
        }

        String firstPart = phoneNumber.substring(0,3);
        String secondPart = phoneNumber.substring(3,6);
        String thirdPart = phoneNumber.substring(6,8);
        String fourthPart = phoneNumber.substring(8);

        System.out.println("+" + code + "(" + firstPart + ")" + secondPart + "-" + thirdPart + "-" +fourthPart);




    }
}
