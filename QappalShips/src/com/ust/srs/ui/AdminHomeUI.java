package com.ust.srs.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.ust.srs.bean.ShipBean;
import com.ust.srs.dao.AdminstratorDAO;

public class AdminHomeUI extends JFrame {

    private JButton viewShipsBtn, addShipBtn, removeShipBtn, logoutBtn;
    private JTextArea displayArea;
    public AdminstratorDAO adminDAO;

    public AdminHomeUI() {
        adminDAO = new AdminstratorDAO();

        setTitle("Admin Dashboard - QappalShips");
        setSize(600, 400);
        setLayout(new BorderLayout(10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Welcome, Admin!"));
        logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(e -> {
            new LoginUI();
            dispose();
        });
        topPanel.add(logoutBtn);

      
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));

        viewShipsBtn = new JButton("View All Ships");
        addShipBtn = new JButton("Add New Ship");
        removeShipBtn = new JButton("Remove Ship");

        buttonPanel.add(viewShipsBtn);
        buttonPanel.add(addShipBtn);
        buttonPanel.add(removeShipBtn);

       
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        
        add(topPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        
        viewShipsBtn.addActionListener(e -> viewAllShips());
        addShipBtn.addActionListener(e -> addShip());
        removeShipBtn.addActionListener(e -> removeShip());

        setVisible(true);
    }

    
    private void viewAllShips() {
        displayArea.setText("");
        ArrayList<ShipBean> ships = adminDAO.viewByAllShips();

        if (ships == null || ships.isEmpty()) {
            displayArea.append("No ships found.\n");
        } else {
            displayArea.append("=== All Registered Ships ===\n");
            for (ShipBean s : ships) {
                displayArea.append("Ship ID: " + s.getShipID() + "\n");
                displayArea.append("Name: " + s.getShipName() + "\n");
                displayArea.append("Seating Capacity: " + s.getSeatingCapacity() + "\n");
                displayArea.append("Reservation Capacity: " + s.getReservationCapacity() + "\n");
                displayArea.append("----------------------------------\n");
            }
        }
    }

    
    private void addShip() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField seatField = new JTextField();
        JTextField reserveField = new JTextField();

        Object[] inputs = {
            "Ship ID:", idField,
            "Ship Name:", nameField,
            "Seating Capacity:", seatField,
            "Reservation Capacity:", reserveField
        };

        int result = JOptionPane.showConfirmDialog(this, inputs, "Add New Ship", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String id = idField.getText().trim();
                String name = nameField.getText().trim();
                int seat = Integer.parseInt(seatField.getText().trim());
                int reserve = Integer.parseInt(reserveField.getText().trim());

                ShipBean ship = new ShipBean(id, name, seat, reserve);
                adminDAO.addShip(ship);

                JOptionPane.showMessageDialog(this, "Ship added successfully!");
                viewAllShips();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please check values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    private void removeShip() {
        String shipId = JOptionPane.showInputDialog(this, "Enter Ship ID to remove:");
        if (shipId != null && !shipId.trim().isEmpty()) {
            ArrayList<String> ids = new ArrayList<>();
            ids.add(shipId.trim());

            int removed = adminDAO.removeShip(ids);
            if (removed > 0) {
                JOptionPane.showMessageDialog(this, "Ship removed successfully!");
                viewAllShips();
            } else {
                JOptionPane.showMessageDialog(this, "No ship found with that ID.");
            }
        }
    }
}