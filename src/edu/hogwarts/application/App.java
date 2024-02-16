package edu.hogwarts.application;

import edu.hogwarts.data.*;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.start();
    }

    public void start() {

        InitData initData = new InitData();

        // Get the potionClass object
        Course potionClass = initData.getPotionClass();

        // Print the potionClass object
        System.out.println(potionClass);
    }

}