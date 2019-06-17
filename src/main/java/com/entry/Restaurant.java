package com.entry;


import com.Factory.Factory;
import com.Factory.absFactory;

public class Restaurant {

    private absFactory factory;

    //构造函数私有化
    private Restaurant(){
        //做菜的工厂
        factory = new Factory();
    }
    //静态内部类
    private static class Inner{
        private static final Restaurant INSTANCE = new Restaurant();
    }
    public static Restaurant getInstance(){
        return Inner.INSTANCE;
        // 静态内部类不随着外部类加载而加载，首次调用getInstance方法时，加载Inner，
        // 在静态区创建INSTANCE对象，
    }

    public Meal getMealShow(String name){
        Meal meal = factory.getMeal(name);
        meal.show();
        return meal;
    }


}