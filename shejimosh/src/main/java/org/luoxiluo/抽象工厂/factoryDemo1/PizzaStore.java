package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    abstract Pizza createPizza(String type);
}
