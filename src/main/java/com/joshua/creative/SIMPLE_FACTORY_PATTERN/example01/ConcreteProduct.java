package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example01;

/**
 * create by: Joshua
 * description: 具体实现类集成抽象父类;重写了methodDifferent()方法
 * create time: 2019/9/18 14:22
 * @params
 * @return
 */
public class ConcreteProduct extends Product{
    void methodDifferent() {
        System.out.println("ConcreteProduct.class");
    }
}
