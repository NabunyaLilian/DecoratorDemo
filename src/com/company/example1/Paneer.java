package com.company.example1;

public class Paneer extends ToppingsDecorator {
    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", paneer";
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }
}
