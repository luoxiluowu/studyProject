package org.luoxiluo.测试文件;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/7/15
 */
interface Hu{

}
class Person {

    public String getName() {
        return "里斯";
    }
}
class Son extends Person implements Hu{


}

class Son1 extends Son {

}
public class 接口方法 {




    public static void main(String[] args) {
//        Supplier<Person> personSupplier = Person::new;
//        Person person = personSupplier.get();
//        System.out.println(person.getName());

        final List<String> strings = new ArrayList<>();
        //返回不被允许修改的list
        List<String> strings1 = Collections.unmodifiableList(strings);
        //这里调用会抛出异常
        strings1.add("dsad");

    }
}
