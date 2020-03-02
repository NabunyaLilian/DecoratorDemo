package com.company.exmple4;

public class SlicedCabbages extends RolexToppingsDecorator {
    public SlicedCabbages(Rolex rolex) {
        super(rolex);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sliced cabbages, ";
    }
}
