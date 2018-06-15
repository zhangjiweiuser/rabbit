package com.zhang.rabbit.entity;

import java.lang.reflect.Method;

/**
 * @author jiwei.zhang
 * @DATE 2018-04-04 上午 9:26
 */
public class ReflectUtil {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.zhang.jiwei.entity.Dept");
//        System.out.println("=====获取所有共有字段=====");
//        Field[] fields = clazz.getFields();
//        for (Field field : fields){
//            System.out.println(field);
//        }
//        System.out.println("====获取所有字段，包括(私有，受保护的，默认的)=====");
//        Field[] fields1 = clazz.getDeclaredFields();
//        for (Field field : fields1){
//            System.out.println(field+"====="+field.getGenericType().getTypeName());
//        }
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName()+"=="+method.toGenericString()+"=="+method.getGenericReturnType().getTypeName());
            Class[] paramType = method.getParameterTypes();
            for(Class param : paramType){
                System.out.println("\t"+param.getTypeName());
            }
        }
    }
}
