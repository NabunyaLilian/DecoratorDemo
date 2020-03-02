package com.company.example2;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }

}
