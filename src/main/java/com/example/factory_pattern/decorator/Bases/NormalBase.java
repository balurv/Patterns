package com.example.factory_pattern.decorator.Bases;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class NormalBase implements PizzaCreationSystem {

    @Override
    public int getPizzaCost() {
        return 150;
    }

    @Override
    public String addToppings() {
        return " added Normal Crust Base";
    }
}
