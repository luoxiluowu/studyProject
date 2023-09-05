package org.luoxiluo.抽象工厂.factoryDemo1;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/4
 */
public abstract class Pizza {



    public abstract void  prepare();


    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
