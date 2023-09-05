package org.luoxiluo.抽象工厂.StatusMaths;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/9/3
 */
public class Demo1 {

    public static Animal getAnimal(String type) {
        Animal animal = null;
        if ("cat".equals(type)) {
            animal = new Cat();
        }else if ("dog".equals(type)) {
            animal = new BlackDog();
        }
        return animal;
    }

    public static void main(String[] args) {
        Animal animal = getAnimal("cat");
        animal.call();
        animal = getAnimal("dog");
        animal.call();
    }
}
