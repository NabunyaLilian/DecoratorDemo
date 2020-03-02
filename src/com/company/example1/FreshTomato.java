package com.company.example1;

public class FreshTomato extends ToppingsDecorator {
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
