package com.tss.pizzaStoreManagement.pizzaStores;

import com.tss.pizzaStoreManagement.ingredientFactories.NewYourPizzaIngredientFactory;
import com.tss.pizzaStoreManagement.ingredientFactories.model.PizzaIngredientFactory;
import com.tss.pizzaStoreManagement.pizzaStores.model.PizzaStore;
import com.tss.pizzaStoreManagement.pizzas.CheesePizza;
import com.tss.pizzaStoreManagement.pizzas.ClamPizza;
import com.tss.pizzaStoreManagement.pizzas.PepperoniPizza;
import com.tss.pizzaStoreManagement.pizzas.model.Pizza;

public class NewYorkPizzaStore implements PizzaStore{

    @Override
    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        System.out.println("New York Style " + pizza.getName() + " has been prepared.");
    }

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NewYourPizzaIngredientFactory();
        return switch (type) {
            case "Cheese" -> new CheesePizza(pizzaIngredientFactory);
            case "Pepperoni" -> new PepperoniPizza(pizzaIngredientFactory);
            case "Clam" -> new ClamPizza(pizzaIngredientFactory);
            default -> null;
        };
    }
}
