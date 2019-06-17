package com.Builder;

import com.entry.Meal;

//建造者模式：指挥者
public class Director {
    private BuilderMeal builderMeal;

    public Director(BuilderMeal builderMeal) {
        this.builderMeal = builderMeal;
    }

    public Meal construct(){
        builderMeal.builder();
        return builderMeal.getMeal();
    }

}
