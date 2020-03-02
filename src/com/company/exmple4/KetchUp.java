package com.company.exmple4;

public class KetchUp extends RolexToppingsDecorator {
    public KetchUp(Rolex rolex) {
        super(rolex);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "ketch up, ";
    }
}
