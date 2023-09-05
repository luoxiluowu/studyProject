package org.luoxiluo;

import java.util.*;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime ${DATE}
 */
public class Main {
    public static void main(String[] args) {

//        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
//        for (URL urL : urLs) {
//            System.out.println(urL.toExternalForm());
//        }
//        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//        System.out.println(contextClassLoader.getParent().getParent());

        // 双亲委派机制
        // 按需加载


        //静态代码块会在初始化（类加载时 clinit）时执行一次
        Long l = null;
        System.out.println(l*12);

    }


    public String addTest() {
        String name = "zhjanng";
        return name;
    }
}