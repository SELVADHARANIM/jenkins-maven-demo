
package com.example;

public class App {

    public String greet() {
        return "Hello from Jenkins Maven pipeline!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}
