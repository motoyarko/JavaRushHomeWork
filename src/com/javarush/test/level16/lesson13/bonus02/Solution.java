package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution
{
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static
    {
        threads.add(new LoopThread());
        threads.add(new InterruptedExceptionThread());
        threads.add(new UraThread());
        threads.add(new MessageThread());
        threads.add(new SummThread());
    }


    private static class LoopThread extends Thread
    {
        @Override
        public void run()
        {
            while (true)
            {
            }
        }
    }

    private static class InterruptedExceptionThread extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    sleep(0);
                }

            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }
        }
    }

    private static class UraThread extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    System.out.println("Ура");
                    sleep(500);

                }
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    private static class MessageThread extends Thread implements Message
    {
        @Override
        public void showWarning()
        {
            interrupt();
            try
            {
                this.join();
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }

        @Override
        public void run()
        {
            while (!isInterrupted())
            {

            }

        }
    }

    private static class SummThread extends Thread
    {


        @Override
        public void run()
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String s;
            {
                try
                {
                    s = bufferedReader.readLine();
                    while (!s.equals("N"))
                    {
                        sum += Integer.parseInt(s);
                        s = bufferedReader.readLine();
                    }
                    bufferedReader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                System.out.println(sum);

            }
        }
    }
}
