package Proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField name_field, email_field;
    JRadioButton male, female;
    JCheckBox checkBox;

    public ContactForm() {
        super("Contact form");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Enter your name: ");
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Enter your email: ");
        email_field = new JTextField("@", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        checkBox = new JCheckBox("Agree?", false);
        JButton send_button = new JButton("Send");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(checkBox);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();

            String isMail = "Male";
            if (!male.isSelected()) {
                isMail = "Female";
            }

            boolean check = checkBox.isSelected();

            JOptionPane.showMessageDialog(
                    null,
                    "Your email " + email + "\n" + "Your gender " + isMail + "\n Do you agree? " + check,
                    "Hello, " + name, JOptionPane.PLAIN_MESSAGE);

        }
    }
}
