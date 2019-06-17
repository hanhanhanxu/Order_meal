package com.entry;

import lombok.Data;

//建造者模式：产品
@Data
public class ManTou extends Meal {
    @Override
    public void show() {
        System.out.println(name);
    }
}
