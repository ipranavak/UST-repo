package com.ust.srs.ui;

import java.awt.*;
import javax.swing.*;
//import com.ust.srs.util.UserImpl; // if you later move login logic here

public class LoginUI extends JFrame {
    private JTextField userID;
    private JPasswordField pass;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginUI() {
        setTitle("QappalShips - Ship Reservation System");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2, 10, 10));

        
        add(new JLabel("User ID: "));
        userID = new JTextField();
        add(userID);

        
        add(new JLabel("Password: "));
        pass = new JPasswordField();
        add(pass);

        
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        add(messageLabel);

        
        loginButton = new JButton("Login");
        add(loginButton);

        
        loginButton.addActionListener(e -> handleLogin());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    private void handleLogin() {
        String user = userID.getText().trim();
        String password = new String(pass.getPassword()).trim();

        // For now, hardcoded credentials
        switch (user) {
            case "admin1":
                if (password.equals("admin123")) {
                    messageLabel.setText("Login successful (Admin)!");
                    JOptionPane.showMessageDialog(this, "Welcome Admin!");
                   
                    new AdminHomeUI();
                    dispose(); 
                } else {
                    messageLabel.setText("Incorrect password for admin!");
                }
                break;

            case "user1":
                if (password.equals("user123")) {
                    messageLabel.setText("Login successful (Customer)!");
                    JOptionPane.showMessageDialog(this, "Welcome User!");
                    
                    new CustomerHomeUI();
                    dispose();
                } else {
                    messageLabel.setText("Incorrect password for user!");
                }
                break;

            default:
                messageLabel.setText("Invalid user ID!");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginUI::new);
    }
}

