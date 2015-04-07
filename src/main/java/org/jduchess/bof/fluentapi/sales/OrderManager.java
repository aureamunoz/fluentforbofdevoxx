package org.jduchess.bof.fluentapi.sales;

public class OrderManager {

    public TransitionBuilder addProductToOrder(String orderId, Product product){

        //...

        return new TransitionBuilder();
    }

    public OrderManager createReturnOrder(){
        //...

        return this;

    }

    public void end(){
        System.out.println("this is the end");
    }
}
