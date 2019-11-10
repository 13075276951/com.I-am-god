# com.I-am-godpackage com.classbook.chapter;

import javax.swing.*;

public class RegisterForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("Register Example");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel postboxLabel = new JLabel("Postbox:");
        postboxLabel.setBounds(10,80,80,25);
        panel.add(postboxLabel);

        JTextField postboxText = new JTextField(20);
        postboxText.setBounds(100,80,165,25);
        panel.add(postboxText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton registerButton = new JButton("register");
        registerButton.setBounds(10, 110, 80, 25);
        panel.add(registerButton);
    }
}
