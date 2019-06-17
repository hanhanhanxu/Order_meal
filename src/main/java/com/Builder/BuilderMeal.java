package com.Builder;

import com.entry.ManTou;
import com.entry.Meal;

//建造者模式：抽象建造者
public abstract class BuilderMeal {
    protected Meal manTou = new ManTou();
    public abstract void builder();
    public Meal getMeal(){
        return manTou;
    }
}
