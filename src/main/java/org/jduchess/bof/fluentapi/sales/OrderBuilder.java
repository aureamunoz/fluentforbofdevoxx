package org.jduchess.bof.fluentapi.sales;

public class OrderBuilder {
    public TransitionBuilder addProductToOrder(String orderId, Product product){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        return new TransitionBuilder();
    }

    public OrderBuilder createReturnOrder(){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        return this;

    }

    public void end(){
        System.out.println("this is the end");
    }
}
