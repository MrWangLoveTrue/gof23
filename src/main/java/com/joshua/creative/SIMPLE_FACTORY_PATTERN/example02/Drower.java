package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example02;

public class Drower {

    public static Picture getPicture(String type) {
        Picture picture = null;
        if ("circle".equalsIgnoreCase(type)) {
            picture = new Circle();
        } else if ("square".equalsIgnoreCase(type)) {
            picture = new Square();
        } else {
            System.out.println("unSupportException");
        }
        return picture;
    }
}
