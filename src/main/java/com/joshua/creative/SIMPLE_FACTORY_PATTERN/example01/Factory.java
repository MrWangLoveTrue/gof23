package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example01;

/**
 * create by: Joshua
 * description: 工厂类
 * create time: 2019/9/18 14:23
 * @params
 * @return
 */
public class Factory {

    public static Product getProduct(String param) {
        Product product = null;
        if ("param".equalsIgnoreCase(param)) {
            product = new ConcreteProduct();
        }
        return product;
    }
}
