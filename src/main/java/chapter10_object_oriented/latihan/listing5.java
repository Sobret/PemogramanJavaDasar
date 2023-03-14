package chapter10_object_oriented.latihan;

import chapter11_inheri_polymorphism.exercise.Course;

public class listing5 {
    public static void main(String[] args) {
        Course course1 = new Course("data structures");
        Course course2 = new Course("database systems");

        course1.addStudent("peter jones");
        course1.addStudent("kim smith");
        course1.addStudent("anne kennedy");

        course2.addStudent("peter jones");
        course2.addStudent("steve smith");

        System.out.println("number of student in course1 : "
        + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("number of student in course2: "
        + course2.getNumberOfStudents());
    }
}
