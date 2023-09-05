package org.luoxiluo.虚方法;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/5/22
 */
interface Father {

    int getAge();


    default int nan() {
        return 1;
    }
}

class Son implements Father {

    @Override
    public int getAge() {
        seelI();
        return 0;
    }

    private int seelI() {
        return 0;
    }

    public int seetIn() {
        return 0;
    }

    public static void zhang() {

    }
}

public class demo1 {


    public static void main(String[] args) {
        Son son = new Son();
        son.getAge();
        son.seetIn();

        son.nan();
        Son.zhang();

        Father father = son;
        father.nan();
        father.getAge();
    }
}
