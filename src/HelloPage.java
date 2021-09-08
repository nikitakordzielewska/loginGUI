import javax.swing.*;

public class HelloPage {

    JFrame frame = new JFrame();
    JLabel helloLabel = new JLabel("Hello World! :)");

    HelloPage(String username){

        helloLabel.setText("Hello "+username);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(helloLabel);

        helloLabel.setBounds(60,100,300,50);
    }

}
