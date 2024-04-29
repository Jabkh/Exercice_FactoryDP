package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Restaurant ramen = new Restaurant(new JapaneseCuisineFactory(new JapaneseDish()));
    }
}