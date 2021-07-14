package fr.efrei.paumier.exemple.stream;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class StudentGroup implements Serializable {
    private final int id;
    private final List<Student> members;

    public StudentGroup(int id, Student... students) {
        this.id = id;
        this.members = Arrays.asList(students.clone());
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "id=" + id +
                ", members=" + members +
                '}';
    }
}
