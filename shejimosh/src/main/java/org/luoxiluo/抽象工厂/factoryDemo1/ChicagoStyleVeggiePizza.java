package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class ChicagoStyleVeggiePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("ChicagoStyleVeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleVeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleVeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleVeggiePizza box");
    }
}
