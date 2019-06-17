package com.Factory;

import com.entry.GongBaoMeal;
import com.entry.Meal;
import com.entry.YuXiangMeal;

public class Factory extends absFactory {
    @Override
    public Meal getMeal(String name) {
        if("一号菜".equals(name)){
            return new YuXiangMeal();
        }else if("二号菜".equals(name)){
            return new GongBaoMeal();
        }else {
            return null;
        }
    }
}
