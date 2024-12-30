package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String studentName;
    private int studentId;
    private String studentEmail;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Student(String studentName, int studentId, String studentEmail, int age) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", studentEmail='" + studentEmail + '\'' +
                ", age=" + age +
                '}';
    }
}
