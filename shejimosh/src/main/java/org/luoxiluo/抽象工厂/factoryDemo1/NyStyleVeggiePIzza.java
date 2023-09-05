package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class NyStyleVeggiePIzza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("NyStyleVeggiePIzza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NyStyleVeggiePIzza bake");
    }

    @Override
    public void cut() {
        System.out.println("NyStyleVeggiePIzza cut");
    }

    @Override
    public void box() {
        System.out.println("NyStyleVeggiePIzza box");
    }
}
