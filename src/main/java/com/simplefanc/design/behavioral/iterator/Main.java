package com.simplefanc.design.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲 ");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程 ");
        Course course6 = new Course("前端课程");
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("---------------------");
        printCourse(courseAggregate);
    }

    private static void printCourse(CourseAggregate courseAggregate) {
        CourseIterator iterator = courseAggregate.getCourseIterator();
        while (!iterator.isLastCourse()){
            Course course = iterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
