package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example01;

/**
 * create by: Joshua
 * description: 抽象父类,所以具体产品类都需要继承这个类
 * create time: 2019/9/18 14:25
 * @params
 * @return
 */
public abstract class Product {
    public void methodSame(){
        //共同的业务方法
        System.out.println("hello methodSame");
    }
    abstract void methodDifferent();
}
