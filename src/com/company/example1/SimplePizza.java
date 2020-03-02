package com.company.example1;

public class SimplePizza extends Pizza {
    public SimplePizza() {
        description = "SimplePizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
