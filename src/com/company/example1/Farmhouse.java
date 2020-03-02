package com.company.example1;

public class Farmhouse extends Pizza {
    public Farmhouse() {
        description = "Farmhouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
