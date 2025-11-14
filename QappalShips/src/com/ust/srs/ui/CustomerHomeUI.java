package com.ust.srs.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.ust.srs.bean.*;
import com.ust.srs.dao.AdminstratorDAO;

public class CustomerHomeUI extends JFrame {

    private JButton viewShipsBtn, viewRoutesBtn, logoutBtn;
    private JTextArea displayArea;
    private AdminstratorDAO adminDAO;

    public CustomerHomeUI() {
        adminDAO = new AdminstratorDAO();

        setTitle("Customer Dashboard - QappalShips");
        setSize(600, 400);
        setLayout(new BorderLayout(10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Welcome, Passenger!"));
        logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(e -> {
            new LoginUI();
            dispose();
        });
        topPanel.add(logoutBtn);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 10));

        viewShipsBtn = new JButton("View Available Ships");
        viewRoutesBtn = new JButton("View Available Routes");

        buttonPanel.add(viewShipsBtn);
        buttonPanel.add(viewRoutesBtn);

        
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        
        viewShipsBtn.addActionListener(e -> viewAllShips());
        viewRoutesBtn.addActionListener(e -> viewAllRoutes());

        setVisible(true);
    }

    
    private void viewAllShips() {
        displayArea.setText("");
        ArrayList<ShipBean> ships = adminDAO.viewByAllShips();

        if (ships == null || ships.isEmpty()) {
            displayArea.append("No ships found.\n");
        } else {
            displayArea.append("=== Available Ships ===\n");
            for (ShipBean s : ships) {
                displayArea.append("Ship ID: " + s.getShipID() + "\n");
                displayArea.append("Name: " + s.getShipName() + "\n");
                displayArea.append("Seating Capacity: " + s.getSeatingCapacity() + "\n");
                displayArea.append("Reservation Capacity: " + s.getReservationCapacity() + "\n");
                displayArea.append("----------------------------------\n");
            }
        }
    }

    
    private void viewAllRoutes() {
        displayArea.setText("");
        ArrayList<RouteBean> routes = adminDAO.viewByAllRoute();

        if (routes == null || routes.isEmpty()) {
            displayArea.append("No routes found.\n");
        } else {
            displayArea.append("=== Available Routes ===\n");
            for (RouteBean r : routes) {
                displayArea.append("Route ID: " + r.getRouteID() + "\n");
                displayArea.append("Source: " + r.getSource() + "\n");
                displayArea.append("Destination: " + r.getDestination() + "\n");
                displayArea.append("Travel Duration: " + r.getTravelDuration() + "\n");
                displayArea.append("Fare: ₹" + r.getFare() + "\n");
                displayArea.append("----------------------------------\n");
            }
        }
    }
}