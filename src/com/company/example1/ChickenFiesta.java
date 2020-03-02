package com.company.example1;

public class ChickenFiesta extends Pizza {
    public ChickenFiesta() {
        description = "ChickenFiesta";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
