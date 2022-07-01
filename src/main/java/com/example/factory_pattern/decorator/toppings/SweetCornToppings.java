package com.example.factory_pattern.decorator.toppings;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class SweetCornToppings implements PizzaCreationSystem {

    PizzaCreationSystem pizzaCreationSystem;

    public SweetCornToppings(PizzaCreationSystem pizzaCreationSystem){
        this.pizzaCreationSystem = pizzaCreationSystem;
    }
    @Override
    public int getPizzaCost() {
        return pizzaCreationSystem.getPizzaCost() + 60;
    }

    @Override
    public String addToppings() {
        return pizzaCreationSystem.addToppings()+" added Indian Sweet Corn to the base! :P eeelpppp";
    }
}
