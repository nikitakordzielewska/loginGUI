import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class GUI implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("reset");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel usernameLabel = new JLabel("username:");
    JLabel passwordLabel = new JLabel("password:");
    JLabel errorMessage = new JLabel("");

    HashMap<String, String> loginInfo;

    GUI(HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(errorMessage);
        frame.add(loginButton);
        frame.add(resetButton);

        usernameLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);
        usernameField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);
        errorMessage.setBounds(155, 50, 250, 35);
        loginButton.setBounds(175, 200, 100, 25);
        resetButton.setBounds(175, 230, 100, 25);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //RESET BUTTON
        if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
        //LOGIN BUTTON
        if (e.getSource() == loginButton) {

            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            //CHECK THE USERNAME AND PASSWORD
            if (loginInfo.containsKey(username)) {
                if (loginInfo.get(username).equals(password)) {
                    errorMessage.setForeground(Color.green);
                    errorMessage.setText("Login successful");
                    frame.dispose();
                    HelloPage helloPage = new HelloPage(username);
                } else {
                    errorMessage.setForeground(Color.red);
                    errorMessage.setText("Invalid login or password");

                }
            } else {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("Invalid login or password");

            }
        }

    }
}
