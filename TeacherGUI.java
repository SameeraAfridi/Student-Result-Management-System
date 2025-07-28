import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class TeacherGUI extends JFrame {

    private JLabel idLabel, aiLabel, psLabel, ethicsLabel, dbmsLabel, coalLabel, sdaLabel;
    private JTextField idField, aiField, psField, ethicsField, dbmsField, coalField, sdaField;
    private JButton addBtn;

    public TeacherGUI(){
        setTitle("Teacher Dashboard");

        idLabel = new JLabel("Student ID:");
        aiLabel = new JLabel("AI:");
        psLabel = new JLabel("Probability and Statistics:");
        ethicsLabel = new JLabel("Ethics:");
        dbmsLabel = new JLabel("DBMS:");
        coalLabel = new JLabel("Coal:");
        sdaLabel = new JLabel("SDA:");
        
        idField = new JTextField(10);
        aiField = new JTextField(10);
        psField = new JTextField(10);
        ethicsField = new JTextField(10);
        dbmsField = new JTextField(10);
        coalField = new JTextField(10);
        sdaField = new JTextField(10);
        
        addBtn = new JButton("Add marks");

        addBtn.setFont(new Font("Verdana", Font.BOLD, 14)); 
        addBtn.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        addBtn.setForeground(Color.WHITE);

        addBtn.addActionListener(e -> {
            String id = idField.getText();
            int ai = Integer.parseInt(aiField.getText()); 
            int ps = Integer.parseInt(psField.getText()); 
            int ethics = Integer.parseInt(ethicsField.getText()); 
            int dbms = Integer.parseInt(dbmsField.getText()); 
            int coal = Integer.parseInt(coalField.getText()); 
            int sda = Integer.parseInt(sdaField.getText());

            Student student = StudentDatabase.findStudentById(id);
            if (student != null) {
                student.setAI(ai);
                student.setProbabilityAndStatistics(ps);
                student.setEthics(ethics);
                student.setDBMS(dbms);
                student.setCoal(coal);
                student.setSDA(sda);
                
                JOptionPane.showMessageDialog(this,"Marks added successfully.");
            } else {
                JOptionPane.showMessageDialog(this,"Student not found.");
            }
        });

        getContentPane().setBackground(new Color(224, 255, 255)); // Light cyan
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); 
        add(idLabel);
        add(idField);
        add(aiLabel);
        add(aiField);
        add(psLabel);
        add(psField);
        add(ethicsLabel);
        add(ethicsField);
        add(dbmsLabel);
        add(dbmsField);
        add(coalLabel);
        add(coalField);
        add(sdaLabel);
        add(sdaField);
        add(addBtn);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
