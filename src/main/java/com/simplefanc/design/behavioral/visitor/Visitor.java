package com.simplefanc.design.behavioral.visitor;

public class Visitor implements IVisitor {
    /**
     * 访问免费课程
     *
     * @param freeCourse
     */
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    /**
     * 访问付费课程
     *
     * @param codingCourse
     */
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
