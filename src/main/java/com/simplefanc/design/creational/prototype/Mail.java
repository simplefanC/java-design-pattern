package com.simplefanc.design.creational.prototype;

import lombok.Data;

/**
 * 实现原型模式的实体类
 */
@Data
public class Mail implements Cloneable {
    /**
     * name
     */
    private String name;

    /**
     * emailAddress
     */
    private String emailAddress;

    /**
     * content
     */
    private String content;


    public Mail() {
        System.out.println("mail class construct");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
