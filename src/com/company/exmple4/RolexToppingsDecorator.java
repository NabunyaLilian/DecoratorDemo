package com.company.exmple4;

public class RolexToppingsDecorator implements Rolex{
    Rolex rolex;

    public RolexToppingsDecorator(Rolex rolex) {
        this.rolex = rolex;
    }

    @Override
    public String getDescription() {
        return this.rolex.getDescription();
    }
}
