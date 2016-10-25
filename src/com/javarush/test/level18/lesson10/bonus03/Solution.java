package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        int id = Integer.parseInt(args[1]);

        if (args[0].equals("-u"))
        {
            updateDB(fileName, id, prepareString(args));
        }
        if (args[0].equals("-d"))
        {
            deleteFromDB(fileName, id);
        }

    }

    public static void updateDB(String fileName, int id, String newString) throws IOException
    {
        String fileTempName = fileName + ".tmp";
        String line;
        FileWriter fileWriter = new FileWriter(fileTempName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        while ((line = bufferedReader.readLine()) != null)
        {

            String line1 = "";
            int currentID;

            if (line.length() > 0)
            {
                if ((line.indexOf(" ") > 0) && (line.indexOf(" ") < 7))
                {
                    line1 = line.substring(0, line.indexOf(" "));
                } else
                {
                    line1 = line.substring(0, 7);
                }
            }

                currentID = Integer.parseInt(line1);


            if (currentID == id)
            {
                fileWriter.write(newString + "\r\n");
            } else fileWriter.write(line + "\r\n");
        }
        bufferedReader.close();
        fileWriter.close();
        File sourceFile = new File(fileName);
        File outputFile = new File(fileTempName);
        sourceFile.delete();
        outputFile.renameTo(sourceFile);
    }

    public static void deleteFromDB(String fileName, int id) throws IOException
    {
        String fileTempName = fileName + ".tmp";
        String line;
        FileWriter fileWriter = new FileWriter(fileTempName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        while ((line = bufferedReader.readLine()) != null)
        {

            String line1 = "";
            int currentID = 0;

            if (line.length() > 0)
            {
                if ((line.indexOf(" ") > 0) && (line.indexOf(" ") < 7))
                {
                    line1 = line.substring(0, line.indexOf(" "));
                } else
                {
                    line1 = line.substring(0, 8);
                }
            }
            try
            {
                currentID = Integer.parseInt(line1);
            }
            catch (NumberFormatException e)
            {

            }
            if (currentID != id)
            {
                fileWriter.write(line + "\r\n");
            }
        }
        bufferedReader.close();
        fileWriter.close();
        File sourceFile = new File(fileName);
        File outputFile = new File(fileTempName);
        sourceFile.delete();
        outputFile.renameTo(sourceFile);
    }

    public static String prepareString(String[] args)
    {
        String productName = args[2];
        for (int i = 3; i < args.length - 2; i++)
        {
            productName = productName + " " + args[i];
        }
        double price = Double.parseDouble(args[args.length - 2]);
        int quantity = Integer.parseInt(args[args.length - 1]);
        String id = args[1];

        StringBuffer outputString = new StringBuffer();
        StringBuffer productNameStringBuffer = new StringBuffer();
        productNameStringBuffer.append(productName).setLength(30);
        StringBuffer idStringBuffer = new StringBuffer();
        idStringBuffer.append(id).setLength(8);
        StringBuffer priceStringBuffer = new StringBuffer();
        priceStringBuffer.append(price).setLength(8);
        StringBuffer quantityStringBuffer = new StringBuffer();
        quantityStringBuffer.append(quantity).setLength(4);

        outputString.append(idStringBuffer).append(productNameStringBuffer).append(priceStringBuffer).append(quantityStringBuffer);
        return outputString.toString().replaceAll("\u0000", " ");
    }

}
