package com.tss.pizzaStoreManagement;

import com.tss.pizzaStoreManagement.pizzaStores.ChicagoPizzaStore;
import com.tss.pizzaStoreManagement.pizzaStores.NewYorkPizzaStore;
import com.tss.pizzaStoreManagement.pizzaStores.model.PizzaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();

        System.out.println("Enter Type for Chicago: ");
        String type = sc.nextLine();
        chicagoPizzaStore.orderPizza(type);

        System.out.println("Enter Type for New York: ");
        type = sc.nextLine();
        newYorkPizzaStore.orderPizza(type);
    }
}
