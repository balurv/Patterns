package com.example.factory_pattern.decorator.toppings;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class OnionToppings implements PizzaCreationSystem {

    PizzaCreationSystem pizzaCreationSystem;

    public OnionToppings(PizzaCreationSystem pizzaCreationSystem){
        this.pizzaCreationSystem = pizzaCreationSystem;
    }
    @Override
    public int getPizzaCost() {
        return pizzaCreationSystem.getPizzaCost() + 45;
    }

    @Override
    public String addToppings() {
        return " added onion toppings to the base";
    }
}
