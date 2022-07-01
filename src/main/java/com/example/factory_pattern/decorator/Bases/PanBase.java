package com.example.factory_pattern.decorator.Bases;

import com.example.factory_pattern.decorator.PizzaCreationSystem;

public class PanBase implements PizzaCreationSystem {

    @Override
    public int getPizzaCost() {
        return 200;
    }

    @Override
    public String addToppings() {
        return " added Pan Crust base";
    }
}
