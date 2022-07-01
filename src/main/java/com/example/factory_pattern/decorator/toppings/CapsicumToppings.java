package com.example.factory_pattern.decorator.toppings;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class CapsicumToppings implements PizzaCreationSystem {

    PizzaCreationSystem pizzaCreationSystem ;
    public CapsicumToppings(PizzaCreationSystem pizzaCreationSystem){
        this.pizzaCreationSystem = pizzaCreationSystem;
    }
    @Override
    public int getPizzaCost() {
        return pizzaCreationSystem.getPizzaCost() + 40;
    }

    @Override
    public String addToppings() {
        return " added Capsicum toppings to the base!";
    }
}
