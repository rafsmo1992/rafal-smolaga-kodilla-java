package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class LargePizzaOrder extends AbstractPizzaOrderDecorator{

    public LargePizzaOrder(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().multiply(new BigDecimal(2));
    }

    @Override
    public String getDescription(){
        return "Large size, " + super.getDescription();
    }
}