package fr.efrei.paumier.exemple.stream;

import java.io.Serializable;

public class Student implements Serializable {
    private final String name;
    private int grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name;
    }

    public Object getName() {
        return name;
    }
}
