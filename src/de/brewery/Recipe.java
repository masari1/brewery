package de.brewery;

import java.util.ArrayList;
import java.util.List;

/**
 * A recipe for a beer.
 */
public class Recipe {

    private String name;
    private List<Ingredient> ingredients;
    private int time;
    private double litre;

    /**
     * Creates a new recipe object.
     *
     * @param name this is the unique name of the recipe
     * @param time duration of brewing process in hours
     * @param litre the amount of litre the recipe produces
     */
    public Recipe(String name, int time, double litre) {
        this.name = name;
        this.time = time;
        this.litre = litre;
        this.ingredients = new ArrayList<>();
    }

    /**
     * Add an ingredient to te recipe
     *
     * @param in ingredient
     */
    public void addIngredient(Ingredient in) {
        this.ingredients.add(in);
    }

    /**
     * Starts the simple brewing process.
     *
     * @return Returns the brewing time.
     */
    public double brew() {
        for (Ingredient in: ingredients) {
            in.consumeAmount();
        }
        return this.time;
    }

    /**
     * Simple toString jus to get some insights of the object
     *
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", time=" + time +
                ", litre=" + litre +
                '}';
    }
}
