package com.Builder;

//建造者模式，具体建造者：建造馒头
public class ConcrectBuilder extends BuilderMeal {
    @Override
    public void builder() {
        BuilderName();
        //可以有其他建造方法
    }
    public void BuilderName(){
        manTou.setName("馒头");
    }
}
