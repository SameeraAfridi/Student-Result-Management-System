import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    private JButton adminBtn;
    private JButton teacherBtn;
    private JButton studentBtn;

    public Main(){
        setTitle("Student Result Management System");

        // Set Layout to BorderLayout
        setLayout(new BorderLayout());

        // Main Panel (replacing background image panel)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Buttons Panel in center
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 20, 20)); 
        buttonPanel.setOpaque(true);
        buttonPanel.setBackground(new Color(245, 245, 220)); // beige
        buttonPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),
                BorderFactory.createEmptyBorder(50, 50, 50, 50)
        ));

        adminBtn = new JButton("Login as Admin.");
        teacherBtn = new JButton("Login as Teacher.");
        studentBtn = new JButton("Login as Student.");

        // Styling
        adminBtn.setBackground(new Color(102, 204, 153)); // greenish
        teacherBtn.setBackground(new Color(102, 204, 255)); // blueish
        studentBtn.setBackground(new Color(255, 182, 193)); // pinkish
        adminBtn.setFont(new Font("Arial", Font.BOLD, 18)); 
        teacherBtn.setFont(new Font("Arial", Font.BOLD, 18)); 
        studentBtn.setFont(new Font("Arial", Font.BOLD, 18)); 

        buttonPanel.add(adminBtn);
        buttonPanel.add(teacherBtn);
        buttonPanel.add(studentBtn);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Footer at bottom
        JLabel footer = new JLabel("Student Result Management System", JLabel.CENTER);
        footer.setFont(new Font("Serif", Font.BOLD, 16)); 
        footer.setOpaque(true);
        footer.setBackground(new Color(245, 245, 220)); // beige
        footer.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); 
        mainPanel.add(footer, BorderLayout.SOUTH);

        // Action Listeners
        adminBtn.addActionListener(e -> new AdminGUI().setVisible(true)); 
        teacherBtn.addActionListener(e -> new TeacherGUI().setVisible(true)); 
        studentBtn.addActionListener(e -> new StudentGUI().setVisible(true)); 

        add(mainPanel);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Main().setVisible(true);
    }
}
