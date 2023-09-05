package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class ChicagoStyleClamPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleClamPizza box");
    }
}
