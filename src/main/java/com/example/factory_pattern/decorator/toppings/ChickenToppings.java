package com.example.factory_pattern.decorator.toppings;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class ChickenToppings implements PizzaCreationSystem {

    PizzaCreationSystem pizzaCreationSystem;
    public  ChickenToppings(PizzaCreationSystem pizzaCreationSystem){
        this.pizzaCreationSystem = pizzaCreationSystem;
    }
    @Override
    public int getPizzaCost() {
        return pizzaCreationSystem.getPizzaCost() + 80;
    }

    @Override
    public String addToppings() {
        return pizzaCreationSystem.addToppings()+" added chicken slices to the base! :)";
    }
}
