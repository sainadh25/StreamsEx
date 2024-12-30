package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fifth {

    public static void main(String[] args) {

        // print first 2 student names with age > 27

        fifth f = new fifth();
        /*f.getStudentList()
                .stream()
                .filter(student -> student.getAge() > 27)
                .map(student -> student.getStudentName())
                .limit(2)
                .forEach(studentName-> System.out.println(studentName));*/

        f.getStudentList()
                .stream()
                .filter(student -> student.getAge() > 27)
                .limit(2) // short-circuiting stateful intermediate operation.
                .forEach(student-> System.out.println(student.getStudentName()));
    }

    public List<Student> getStudentList() {
        Student student1 = new Student("Sai", 1, "sai@gmail.com", 25);
        Student student2 = new Student("Sri", 2, "sri@gmail.com", 28);
        Student student3 = new Student("Bhu", 3, "bhu@gmail.com", 29);
        Student student4 = new Student("Tej", 4, "tej@gmail.com", 31);

        return new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
    }
}
