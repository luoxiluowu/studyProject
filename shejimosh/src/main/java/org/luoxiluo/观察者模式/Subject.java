package org.luoxiluo.观察者模式;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/8/20
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
