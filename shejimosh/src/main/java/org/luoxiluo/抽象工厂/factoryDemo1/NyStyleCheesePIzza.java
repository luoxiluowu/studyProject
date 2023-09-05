package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class NyStyleCheesePIzza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NyStyleCheesePIzza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NyStyleCheesePIzza bake");
    }

    @Override
    public void cut() {
        System.out.println("NyStyleCheesePIzza cut");
    }

    @Override
    public void box() {
        System.out.println("NyStyleCheesePIzza box");
    }
}
