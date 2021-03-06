package com.simplefanc.design.creational.singleton.enumSingleton;

/**
 * 枚举式单例  可以防止序列化反序列化  也可以抵御反射攻击
 */
public enum EnumSingleton {
    INSTANCE() {
        public void testPrint() {
            System.out.println("测试打印");
        }
    };

    public abstract void testPrint();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
