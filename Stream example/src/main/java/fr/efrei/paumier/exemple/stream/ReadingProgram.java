package fr.efrei.paumier.exemple.stream;

import java.io.*;

public class ReadingProgram {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentClass studentClass = loadStudentClass();
        System.out.println(studentClass.toString());
    }

    private static StudentClass loadStudentClass() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("output.dat");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        StudentClass studentClass = (StudentClass) objectInputStream.readObject();

        objectInputStream.close();
        bufferedInputStream.close();
        fileInputStream.close();

        return studentClass;
    }
}
