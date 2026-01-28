package com.tss.pizzaStoreManagement.Ingredients;

import com.tss.pizzaStoreManagement.Ingredients.model.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String getDoughName(){
        return "Thin Crust Dough";
    }
}
