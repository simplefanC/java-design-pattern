package com.simplefanc.design.structural.flyweight;

/**
 * 享元模式：创建多个重复使用的对象，放入池子中，以便重复使用
 */
public class Main {

    private final static String[] DEPARTMENTS = {"AS", "HR", "DE"};
    private final static String[] NAMES = {"张三", "李四", "王五"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //Math.random() :0~1之间
            int random = (int) (Math.random() * DEPARTMENTS.length);
            Employee manager = EmployeeFactory.getManager(DEPARTMENTS[random], NAMES[random]);
            manager.report();
        }

        //Integer里面运用到了享元模式 缓存的值在-128 ~ 127 之间 超过了就要重新创建对象
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}
