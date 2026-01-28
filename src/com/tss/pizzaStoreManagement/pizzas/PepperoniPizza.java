package com.tss.pizzaStoreManagement.pizzas;

import com.tss.pizzaStoreManagement.ingredientFactories.model.PizzaIngredientFactory;
import com.tss.pizzaStoreManagement.pizzas.model.Pizza;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.dough = pizzaIngredientFactory.createDough();
        this.pepperoni = pizzaIngredientFactory.createPepperoni();
    }

    @Override
    public String getName() {
        return "Pepperoni Pizza";
    }
}
