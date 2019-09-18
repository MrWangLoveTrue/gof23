package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example01;

/**
 * create by: Joshua
 * description: 测试类
 * create time: 2019/9/18 14:26
 * @params
 * @return
 */
public class Client {
    public static void main(String[] args) {
        Product param = Factory.getProduct("param");
        param.methodDifferent();
        param.methodSame();
    }
}
