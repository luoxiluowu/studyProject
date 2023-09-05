package org.luoxiluo;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/8/16
 */
public class LazySingletonText {

    public static void main(String[] args) throws Exception {

        File file = new File("objectFile.txt");
        //如果不存在创建新的文件
        if (!file.exists()){
            file.createNewFile();
        }
        ObjectOutputStream fileOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        LazySingleton lazySingleton = LazySingleton.getInstance();
        fileOutputStream.writeObject(lazySingleton);
        fileOutputStream.flush();
        //读取公共序列化的对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        LazySingleton o = (LazySingleton)objectInputStream.readObject();
        System.out.println(o == lazySingleton);
    }

//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//
//        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
//        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
////        LazySingleton lazySingleton = declaredConstructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
////        System.out.println(lazySingleton == instance);
//    }

}


class LazySingleton implements Serializable{

    private volatile static LazySingleton lazySingleton;

    private static int classCount=0;

    private LazySingleton() {
        if (classCount > 0) {
            throw new RuntimeException("创建了两个实例");
        }
        classCount++;
    }
    protected Object readResolve() throws ObjectStreamException {
        return lazySingleton;
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
