package com.company.exmple4;

public class RawOnions extends RolexToppingsDecorator {
    public RawOnions(Rolex rolex) {
        super(rolex);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "raw onions, ";
    }
}
