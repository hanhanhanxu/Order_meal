package com.entry;

import lombok.Data;

@Data
public abstract class Meal {
    protected String name;
    public abstract void show();
}
