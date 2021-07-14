package fr.efrei.paumier.exemple.stream;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.List;
import java.util.function.Function;

public class StudentsTablePane extends JScrollPane {

    private final JTable studentsTable;
    private final List<Student> students;
    private final StudentTableModel model;

    public StudentsTablePane(List<Student> students) {
        this.students = students;

        this.model = new StudentTableModel();
        this.studentsTable = new JTable(model);
        this.setViewportView(studentsTable);

        new Thread(() -> {
            try {
                Thread.sleep(3000);

                Student student = new Student("Thibaud Duprez", 15);
                students.add(student);
                //model.fireTableRowsInserted(this.students.size() - 1, this.students.size() - 1);
                model.fireTableDataChanged();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public class StudentTableModel extends AbstractTableModel {
        private final StudentColumns[] columns = StudentColumns.values();

        @Override
        public String getColumnName(int columnIndex) {
            return columns[columnIndex].getHeader();
        }

        @Override
        public int getRowCount() {
            return students.size();
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Student student = students.get(rowIndex);
            return columns[columnIndex].getContent(student);
        }
    }

    public enum StudentColumns {
        NAME("Name", Student::getName),
        GRADE("Grade", Student::getGrade);

        private final String header;
        private final Function<Student, Object> accessor;

        StudentColumns(String header, Function<Student, Object> accessor) {
            this.header = header;
            this.accessor = accessor;
        }

        public String getHeader() {
            return header;
        }

        public Object getContent(Student student) {
            return accessor.apply(student);
        }
    }
}
