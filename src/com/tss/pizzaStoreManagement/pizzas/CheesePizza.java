package com.tss.pizzaStoreManagement.pizzas;

import com.tss.pizzaStoreManagement.ingredientFactories.model.PizzaIngredientFactory;
import com.tss.pizzaStoreManagement.pizzas.model.Pizza;

public class CheesePizza extends Pizza {
    public final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.dough = pizzaIngredientFactory.createDough();
    }

    @Override
    public String getName() {
        return "Cheese Pizza";
    }
}
