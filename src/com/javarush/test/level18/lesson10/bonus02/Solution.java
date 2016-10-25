package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String command = args[0];
        if (command.equals("-c"))
        {
            String productName = args[1];
            for (int i = 2; i < args.length - 2; i++)
            {
                productName = productName + " " + args[i];
            }
            double price = Double.parseDouble(args[args.length - 2]);
            int quantity = Integer.parseInt(args[args.length - 1]);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            bufferedReader.close();

            FileWriter fileWriter1 = new FileWriter(fileName, true);
            fileWriter1.close();

            String line;
            String lastline = "";
            int maxID = 0;
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
            while ((line = bufferedReader1.readLine()) != null)
            {

                String line1 = "";
                int currentID = 0;
                lastline = line;

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

                maxID = (maxID > currentID) ? maxID : currentID;
            }


            bufferedReader1.close();
            int id = ++maxID;


            StringBuffer outputString = new StringBuffer();
            StringBuffer productNameStringBuffer = new StringBuffer();
            productNameStringBuffer.append(productName).setLength(30);
            StringBuffer idStringBuffer = new StringBuffer();
            idStringBuffer.append(id).setLength(8);
            StringBuffer priceStringBuffer = new StringBuffer();
            priceStringBuffer.append(price).setLength(8);
            StringBuffer quantityStringBuffer = new StringBuffer();
            quantityStringBuffer.append(quantity).setLength(4);

            FileWriter fileWriter = new FileWriter(fileName, true);
            outputString.append(idStringBuffer).append(productNameStringBuffer).append(priceStringBuffer).append(quantityStringBuffer);

            if (!lastline.isEmpty())
            {
                fileWriter.write("\r\n" + outputString.toString().replaceAll( "\u0000", " "));
            } else fileWriter.write(outputString.toString().replaceAll("\u0000", " "));
            fileWriter.close();
        }
    }
}
