package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NyStyleCheesePIzza();
        } else if ("veggie".equals(type)) {
            return new NyStyleVeggiePIzza();
        } else if ("clam".equals(type)) {
            return new NyStyleClamPizza();
        }
        return null;
    }
}
