package fr.efrei.paumier.exemple.stream;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class WritingProgram {
    public static void main(String[] args) throws IOException {
        StudentClass studentClass = createDefaultStudentClass();
        System.out.println(studentClass.toString());
        saveStudentClass(studentClass);
    }

    private static void saveStudentClass(StudentClass studentClass) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.dat");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {
            objectOutputStream.writeObject(studentClass);
        }
    }

    public static StudentClass createDefaultStudentClass() {
        StudentClass studentClass = new StudentClass();

        Student johnDoe = new Student("John Doe");
        Student janeDoe = new Student("Jane Doe");
        Student johnSmith = new Student("John Smith");

        studentClass.addStudents(johnDoe, janeDoe, johnSmith);
        studentClass.addGroup(johnDoe, janeDoe);
        studentClass.addGroup(johnSmith);

        return studentClass;
    }
}
