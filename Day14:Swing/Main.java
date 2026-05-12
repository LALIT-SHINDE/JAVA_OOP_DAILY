// Write a program to design an admission enquiry form using Swing. write a code
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AdmissionForm extends JFrame implements ActionListener {

    JLabel title, nameLabel, genderLabel, courseLabel, addressLabel, mobileLabel;
    JTextField nameField, mobileField;
    JTextArea addressArea;
    JRadioButton male, female;
    ButtonGroup bg;
    JComboBox<String> courseBox;
    JButton submit, reset;

    AdmissionForm() {

        // Frame Title
        setTitle("Admission Enquiry Form");

        // Layout
        setLayout(null);

        // Title
        title = new JLabel("Admission Enquiry Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(120, 20, 300, 30);
        add(title);

        // Name
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 80, 200, 30);
        add(nameField);

        // Gender
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 30);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(150, 130, 80, 30);

        female = new JRadioButton("Female");
        female.setBounds(240, 130, 100, 30);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        // Course
        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 180, 100, 30);
        add(courseLabel);

        String courses[] = {"BCA", "BSc", "BCom", "BBA", "MCA"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 180, 200, 30);
        add(courseBox);

        // Address
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 230, 100, 30);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(150, 230, 200, 60);
        add(addressArea);

        // Mobile
        mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 320, 100, 30);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(150, 320, 200, 30);
        add(mobileField);

        // Buttons
        submit = new JButton("Submit");
        submit.setBounds(100, 380, 100, 30);
        submit.addActionListener(this);
        add(submit);

        reset = new JButton("Reset");
        reset.setBounds(230, 380, 100, 30);
        reset.addActionListener(this);
        add(reset);

        // Frame Settings
        setSize(450, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String gender = "";

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }

            String data =
                    "Name: " + nameField.getText() +
                    "\nGender: " + gender +
                    "\nCourse: " + courseBox.getSelectedItem() +
                    "\nAddress: " + addressArea.getText() +
                    "\nMobile: " + mobileField.getText();

            JOptionPane.showMessageDialog(this, data);
        }

        if (e.getSource() == reset) {

            nameField.setText("");
            mobileField.setText("");
            addressArea.setText("");
            bg.clearSelection();
            courseBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new AdmissionForm();
    }
}
