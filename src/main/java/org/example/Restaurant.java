package org.example;

public class Restaurant {
    private Ingredient ingredient;
    private CookingUtensil cookingutensil;
    private Dish dish;

    public Restaurant (CuisineFactory factory){
        ingredient = factory.createIngredient();
        cookingutensil = factory.createUtensil();
        dish = factory.createDish();
    }
}
