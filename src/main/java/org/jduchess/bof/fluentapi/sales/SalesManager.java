package org.jduchess.bof.fluentapi.sales;

public class SalesManager {

    public static TransitionBuilder checkValidityForProduct(Product product){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        return new TransitionBuilder();

    }
}
