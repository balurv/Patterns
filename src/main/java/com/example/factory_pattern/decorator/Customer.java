package com.example.factory_pattern.decorator;

import com.example.factory_pattern.decorator.Bases.PanBase;
import com.example.factory_pattern.decorator.Bases.ThinCrustBase;
import com.example.factory_pattern.decorator.toppings.ChickenToppings;
import com.example.factory_pattern.decorator.toppings.SweetCornToppings;

public class Customer {
    public static void main(String[] args) {
        PizzaCreationSystem baluSweetCornChicken =
            new SweetCornToppings(
                new ChickenToppings(
                        new PanBase(
                        )
                )
            );
        System.out.println(baluSweetCornChicken.getPizzaCost());
        System.out.println(baluSweetCornChicken.addToppings());
    }
}
