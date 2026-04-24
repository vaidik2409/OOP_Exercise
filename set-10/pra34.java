import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class pra34 extends JFrame {

    private final JTextField rollField;
    private final JTextField nameField;
    private final JTextField ageField;
    private final JTextField emailField;

    public pra34() {
        super("Registration Form");
        rollField = new JTextField(20);
        nameField = new JTextField(20);
        ageField = new JTextField(20);
        emailField = new JTextField(20);

        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Roll No:"), gbc);
        gbc.gridx = 1;
        formPanel.add(rollField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        formPanel.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        JButton submit = new JButton("Submit");
        submit.addActionListener(e -> onSubmit());

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        formPanel.add(submit, gbc);

        add(formPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void onSubmit() {
        try {
            int roll = Integer.parseInt(rollField.getText().trim());
            int age = Integer.parseInt(ageField.getText().trim());
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();

            if (!email.contains("@") || !email.contains(".")) {
                throw new IllegalArgumentException("Invalid Email");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"))) {
                bw.write(roll + " " + name + " " + age + " " + email);
            }

            JOptionPane.showMessageDialog(this,
                    "Registration Successful\nRoll: " + roll +
                            "\nName: " + name +
                            "\nAge: " + age +
                            "\nEmail: " + email,
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Roll No and Age must be integers",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new pra34().setVisible(true));
    }
}