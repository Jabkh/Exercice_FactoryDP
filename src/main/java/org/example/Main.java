package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Restaurant Ramen = new Restaurant(new JapaneseCuisineFactory());
        Restaurant Taco = new Restaurant(new MexicanCuisineFactory());
        Restaurant Tiramisu = new Restaurant(new ItalianCuisineFactory());
    }
}