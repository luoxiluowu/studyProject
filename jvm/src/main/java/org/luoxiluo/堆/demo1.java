package org.luoxiluo.堆;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/6/1
 */
public class demo1 {

    public static void main(String[] args) throws InterruptedException {
        long l = Runtime.getRuntime().totalMemory() / 1_024 / 1_024;
        System.out.println("开始内存"+ l);
        long l1 = Runtime.getRuntime().maxMemory() / 1_024 / 1_024;
        System.out.println("最大内存:" + l1);
        TimeUnit.MINUTES.sleep(100);


    }
}
