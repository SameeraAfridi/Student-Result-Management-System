import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class AdminGUI extends JFrame {

    private JButton manageStudentBtn;

    public AdminGUI(){
        setTitle("Admin Dashboard");

        manageStudentBtn = new JButton("Add Student");

        manageStudentBtn.setFont(new Font("Verdana", Font.BOLD, 14)); 
        manageStudentBtn.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        manageStudentBtn.setForeground(Color.WHITE);

        manageStudentBtn.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(this,"Enter Student ID:");
            String name = JOptionPane.showInputDialog(this,"Enter Student Name:");
            if (id != null && name != null) {
                Student student = new Student(id, name);
                StudentDatabase.addStudent(student);
                JOptionPane.showMessageDialog(this,"Student added successfully.");
            }
        });

        getContentPane().setBackground(new Color(224, 255, 255)); // Light cyan
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));  
        add(manageStudentBtn);
        setSize(500, 400);
        setLocationRelativeTo(null);
    }
}
