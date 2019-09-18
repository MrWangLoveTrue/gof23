package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example02;

public class Circle implements Picture {
    public void drow() {
        System.out.println("绘制了：[圆形]");
    }

    public void erase() {
        System.out.println("擦除了：[圆形]");
    }
}
