package com.company.exmple4;

public class FreshTomatotoes extends RolexToppingsDecorator {
    public FreshTomatotoes(Rolex rolex) {
        super(rolex);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "fresh tomatoes, ";
    }
}
