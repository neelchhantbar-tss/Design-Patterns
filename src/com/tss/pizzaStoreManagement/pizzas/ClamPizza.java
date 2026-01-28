package com.tss.pizzaStoreManagement.pizzas;

import com.tss.pizzaStoreManagement.ingredientFactories.model.PizzaIngredientFactory;
import com.tss.pizzaStoreManagement.pizzas.model.Pizza;

public class ClamPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.dough = pizzaIngredientFactory.createDough();
        this.clam = pizzaIngredientFactory.createClam();
        this.sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public String getName() {
        return "Clam Pizza";
    }
}
