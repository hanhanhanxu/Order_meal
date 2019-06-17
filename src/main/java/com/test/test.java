package com.test;

import com.Builder.BuilderMeal;
import com.Builder.ConcrectBuilder;
import com.Builder.Director;
import com.entry.Meal;
import com.entry.Restaurant;

public class test {
    public static void main(String[] args) {
        //使用单例模式创建餐厅对象
        Restaurant restaurant = Restaurant.getInstance();
        Restaurant restaurant2 = Restaurant.getInstance();
        System.out.println(restaurant==restaurant2);

        //使用工厂模式实现输入一号菜,创建鱼香肉丝对象并输出鱼香肉丝菜名
        //使用工厂模式实现输入二号菜,创建宫保鸡丁对象并输出宫保鸡丁菜名
        restaurant.getMealShow("一号菜");//restaurant注入抽象factory，getMealShow()利用工厂生产meal
        restaurant.getMealShow("二号菜");

        //使用建造者模式，批量的创建馒头对象，并进行批量输出
        BuilderMeal builderMeal = new ConcrectBuilder();
        Director director = new Director(builderMeal);
        Meal mantou1 = director.construct();
        Meal mantou2 = director.construct();
        Meal mantou3 = director.construct();
        Meal mantou4 = director.construct();
        mantou1.show();
        mantou2.show();
        mantou3.show();
        mantou4.show();
    }
}
