package com.tss.pizzaStoreManagement.pizzas.model;

import com.tss.pizzaStoreManagement.Ingredients.model.*;

public abstract class Pizza {
    public Cheese cheese;
    public Dough dough;
    public Sauce sauce;
    public Clam clam;
    public Pepperoni pepperoni;

    public abstract void prepare();
    public abstract String getName();
}
