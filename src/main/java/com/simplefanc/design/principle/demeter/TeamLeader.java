package com.simplefanc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourses() {
        List<Object> courseList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courseList.add(new Course());
        }
        System.out.println("课程数量：" + courseList.size());
    }
}
