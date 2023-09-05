package org.luoxiluo.被动引用;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/5/23
 */

interface hu {
    String ht = "dsad";
}
class SuperClass {

    static {
        System.out.println("SuperClass init");
    }
    public static String value = "124";
}

class SubClass extends SuperClass implements hu{

    static {
        System.out.println("SubClass init");
    }
    public static String v = "123";
}

class ConstClass {

    static {
        System.out.println("ConstClass init");
    }
    public static final String HELLO_WORLD = "hello world";
}
public class demo1 {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO_WORLD);
    }
}

interface shu{

}