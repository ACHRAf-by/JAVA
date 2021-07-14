package fr.efrei.paumier.exemple.stream;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.ArrayList;

public class GuiProgram extends JFrame {
    public GuiProgram(List<Student> students) {
        setTitle("Hello World");

        setLayout(new BorderLayout());

        /*add(new StudentsTablePane(students), BorderLayout.CENTER);
        add(createControlPanel(), BorderLayout.SOUTH);*/
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Students", new StudentsTablePane(students));
        tabbedPane.add("Actions", createControlPanel());
        add(tabbedPane, BorderLayout.CENTER);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel createControlPanel() {
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout((new FlowLayout()));

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.addActionListener(event -> this.setVisible(false));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setTitle("Clicked : " + e.getPoint());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setTitle("Pressed : " + e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setTitle("Released : " + e.getPoint());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setTitle("Entered : " + e.getPoint());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                setTitle("Exited : " + e.getPoint());

            }
        });
        controlPanel.add(exitButton);

        JButton saveButton = new JButton();
        saveButton.setText("Save");
        controlPanel.add(saveButton);

        return controlPanel;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student johnDoe = new Student("John Doe", 18);
        Student janeDoe = new Student("Jane Doe", 16);
        Student johnSmith = new Student("John Smith", 14);
        students.add(johnDoe);
        students.add(janeDoe);
        students.add(johnSmith);

        GuiProgram frame = new GuiProgram(students);

        frame.setVisible(true);
    }
}
