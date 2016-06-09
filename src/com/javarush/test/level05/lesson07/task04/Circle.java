package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    public int centerX, centerY, radius, width, color;


    public void initialize(int centerX, int centerY, int radius, int width, int color)
    {
        this.color = color;
        this.width = width;
        this.radius = radius;
        this.centerY = centerY;
        this.centerX = centerX;
    }

    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.width = width;
        this.radius = radius;
        this.centerY = centerY;
        this.centerX = centerX;
    }

    public void initialize(int centerX, int centerY, int radius)
    {
        this.radius = radius;
        this.centerY = centerY;
        this.centerX = centerX;
    }


}

