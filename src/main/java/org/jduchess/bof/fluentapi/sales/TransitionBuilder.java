package org.jduchess.bof.fluentapi.sales;

public class TransitionBuilder {

    public OrderManager on(ValidityStatus status){

        //...

        return new OrderManager();
    }

    public TransitionBuilder from (TransitionBuilder transitionBuilder){
        //...

        return this;

    }
}
