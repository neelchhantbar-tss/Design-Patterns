package com.tss.pizzaStoreManagement.pizzaStores.model;

import com.tss.pizzaStoreManagement.pizzas.model.Pizza;

public interface PizzaStore {
    void orderPizza(String type);
    Pizza createPizza(String type);
}
