package org.luoxiluo.堆;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/6/2
 */
public class GcDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        String s = "a";
        while (true) {
            s += 'a';
            strings.add(s);
        }
    }
}
