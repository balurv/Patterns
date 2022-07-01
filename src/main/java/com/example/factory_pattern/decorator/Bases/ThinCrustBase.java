package com.example.factory_pattern.decorator.Bases;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class ThinCrustBase implements PizzaCreationSystem {
    PizzaCreationSystem pizzaCreationSystem;
    public ThinCrustBase(){}


    @Override
    public int getPizzaCost() {
        return 100;
    }

    @Override
    public String addToppings() {
        return " added ThinCrust Base";
    }


}
