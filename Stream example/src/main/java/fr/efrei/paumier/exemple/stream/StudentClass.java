package fr.efrei.paumier.exemple.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentClass implements Serializable {
    private List<Student> students;
    private List<StudentGroup> studentGoups;

    public StudentClass() {
        this.students = new ArrayList<>();
        this.studentGoups = new ArrayList<>();
    }

    public void addStudents(Student... students) {
        this.students.addAll(Arrays.asList(students));
    }

    public void addGroup(Student... students) {
        int id = this.studentGoups.size();
        this.studentGoups.add(new StudentGroup(id, students));
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "students=" + students +
                ", studentGoups=" + studentGoups +
                '}';
    }
}
