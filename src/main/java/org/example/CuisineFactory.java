package org.example;

public abstract class CuisineFactory {
    public abstract Ingredient createIngredient();
    public abstract CookingUtensil createUtensil();
    public abstract Dish createDish();

}
