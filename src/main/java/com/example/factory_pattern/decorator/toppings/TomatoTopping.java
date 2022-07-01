package com.example.factory_pattern.decorator.toppings;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class TomatoTopping implements PizzaCreationSystem {

    PizzaCreationSystem pizzaCreationSystem;

    public TomatoTopping(PizzaCreationSystem pizzaCreationSystem){
        this.pizzaCreationSystem = pizzaCreationSystem;
    }
    @Override
    public int getPizzaCost() {
        return pizzaCreationSystem.getPizzaCost() + 40;
    }

    @Override
    public String addToppings() {
        return " added Tomato Slices to thin crust base ";
    }
}
