package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {


        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Text to beautify 1", (beautifiedText) -> beautifiedText + " ABC");
        beautifier.beautify("Text to beautify 2", (beautifiedText) -> beautifiedText.toUpperCase());
        beautifier.beautify("Text to beautify 3", (beautifiedText) -> beautifiedText + "!!!");
        beautifier.beautify("Text to beautify 4", (beautifiedText) -> ">>>" + beautifiedText + "<<<");
        beautifier.beautify("Text to beautify 5", (beautifiedText) -> beautifiedText.toLowerCase());;
/*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

 */
    }
}