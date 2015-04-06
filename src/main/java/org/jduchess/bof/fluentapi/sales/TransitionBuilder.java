package org.jduchess.bof.fluentapi.sales;

public class TransitionBuilder {
    public OrderBuilder on(ValidityStatus status){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName()+" "+ status.name());
        return new OrderBuilder();
    }

    public TransitionBuilder from (TransitionBuilder transitionBuilder){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        return this;

    }
}
