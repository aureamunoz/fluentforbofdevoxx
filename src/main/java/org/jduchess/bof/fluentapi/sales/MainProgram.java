package org.jduchess.bof.fluentapi.sales;

import static org.jduchess.bof.fluentapi.sales.SalesManager.checkValidityForProduct;

public class MainProgram {


    public static void main(String[] args) {

        Product milk = new Product("milk");

        SalesManager.checkValidityForProduct(milk)
                .on(ValidityStatus.UNEXPIRED)
                .addProductToOrder("32987982", milk)
                .from(checkValidityForProduct(milk))
                .on(ValidityStatus.EXPIRED)
                .createReturnOrder().end();
    }
}
