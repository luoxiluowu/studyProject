package org.luoxiluo.GC测试;

/**
 * VM -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/6/25
 */
public class DemoOne {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[4 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];
    }
}
