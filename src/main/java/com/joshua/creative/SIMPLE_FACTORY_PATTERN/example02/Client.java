package com.joshua.creative.SIMPLE_FACTORY_PATTERN.example02;

public class Client {
    public static void main(String[] args) {
        Picture black = Drower.getPicture("black");
        if (black != null) {
            black.drow();
            black.erase();
        }
        Picture circle = Drower.getPicture("circle");
        if (circle != null) {
            circle.drow();
            circle.erase();
        }
    }
}
