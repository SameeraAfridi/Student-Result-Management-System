import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class StudentGUI extends JFrame {

    private JButton viewGradeBtn;

    public StudentGUI(){
        setTitle("Student Dashboard");

        viewGradeBtn = new JButton("View Grade");

        viewGradeBtn.setFont(new Font("Verdana", Font.BOLD, 14)); 
        viewGradeBtn.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        viewGradeBtn.setForeground(Color.WHITE);

        viewGradeBtn.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(this,"Enter Student ID:");
            Student student = StudentDatabase.findStudentById(id);
            if (student != null) {
                
                int total = student.getAI()
                             + student.getProbabilityAndStatistics()
                             + student.getEthics()
                             + student.getDBMS()
                             + student.getCoal()
                             + student.getSDA();

                int average = total / 6;

                if (average >= 80) {
                    JOptionPane.showMessageDialog(this,"Grade: A (" + average + ")");
                } else if (average >= 60) {
                    JOptionPane.showMessageDialog(this,"Grade: B (" + average + ")");
                } else if (average >= 50) {
                    JOptionPane.showMessageDialog(this,"Grade: C (" + average + ")");
                } else {
                    JOptionPane.showMessageDialog(this,"Grade: F (" + average + ")");
                }
            } else {
                JOptionPane.showMessageDialog(this,"Student not found.");
            }
        });

        getContentPane().setBackground(new Color(224, 255, 255)); // Light cyan
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));  
        add(viewGradeBtn);
        setSize(500, 400);
        setLocationRelativeTo(null);
    }
}
