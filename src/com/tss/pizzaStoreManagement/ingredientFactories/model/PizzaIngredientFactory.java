package com.tss.pizzaStoreManagement.ingredientFactories.model;

import com.tss.pizzaStoreManagement.Ingredients.model.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Clam createClam();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
}