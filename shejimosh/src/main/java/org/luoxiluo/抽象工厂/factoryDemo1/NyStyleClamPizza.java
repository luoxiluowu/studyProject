package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class NyStyleClamPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("NyStyleClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NyStyleClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NyStyleClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NyStyleClamPizza box");
    }
}
