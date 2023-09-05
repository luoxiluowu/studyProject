package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class demo1 {

    public static void main(String[] args) {

        ChicagoPizzeStore nyPizzaStore = new ChicagoPizzeStore();
        Pizza clam = nyPizzaStore.orderPizza("cheese");
    }
}
