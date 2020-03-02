package com.company.example1;

public class Barbeque extends ToppingsDecorator {
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", barbeque";
    }

    @Override
    public int getCost() {
        return 90 + pizza.getCost();
    }
}
