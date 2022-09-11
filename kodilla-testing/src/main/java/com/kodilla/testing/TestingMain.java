package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();

        if (calculator.add(5, 6) == 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (calculator.subtract(7, 6) == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}