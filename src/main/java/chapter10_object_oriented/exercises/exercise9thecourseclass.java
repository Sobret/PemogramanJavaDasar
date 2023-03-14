package chapter10_object_oriented.exercises;

public class exercise9thecourseclass {
    public static void main(String[] args) {
        Course math101 = new Course("math101");

        // Add three students
        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("Joan");

        math101.dropStudent("Tom");

        System.out.println("\nThe students in the course " +
                math101.getCourseName() + ":");
        String[] students = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}
