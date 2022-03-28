package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newUser implements ActionListener {

    private static JFrame frame;
    private static JLabel title;
    private static JLabel surnameLabel;
    private static JLabel firstNameLabel;
    private static JLabel otherNameLabel;
    private static JLabel genderLabel;
    private static JLabel titleLabel;
    private static JLabel birthLabel;
    private static JLabel departmentLabel;
    private static JLabel heightLabel;
    private static JLabel currentWeightLabel;
    private static JLabel goalWeightLabel;
    private static JTextField userSurname;
    private static JTextField userFirstName;
    private static JTextField userOtherName;
    private static JTextField userBirth;
    private static JTextField userDepartment;
    private static JTextField userHeight;
    private static JTextField userCurrentWeight;
    private static JTextField userGoalWeight;
    private static String[] titleChoice = {"Mr","Mrs","Miss"};
    private static String[] genderChoice = {"Male","Female"};
    private static JComboBox titleType;
    private static JComboBox genderType;
    private static JButton submitButton;

    newUser() {

        frame = new JFrame();

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        // adding panel to frame
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }


    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        title = new JLabel("NEW USER");
        title.setBounds(100,0,200,50);
        title.setFont(new Font(null,Font.PLAIN,25));
        panel.add(title);


        // Creating JLabel
        surnameLabel = new JLabel("Surname:");
        surnameLabel.setBounds(10,60,120,25);
        panel.add(surnameLabel);

        userSurname = new JTextField(20);
        userSurname.setBounds(150,60,85,25); //20
        panel.add(userSurname);

        // Creating JLabel
        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10,90,120,25);
        panel.add(firstNameLabel);

        userFirstName = new JTextField(20);
        userFirstName.setBounds(150,90,85,25); //20
        panel.add(userFirstName);

        // Creating JLabel
        otherNameLabel = new JLabel("Other Name:");
        otherNameLabel.setBounds(10,120,120,25);
        panel.add(otherNameLabel);

        userOtherName = new JTextField(20);
        userOtherName.setBounds(150,120,85,25); //20
        panel.add(userOtherName);

        // Creating Title Choices
        titleLabel = new JLabel("Title:");
        titleLabel.setBounds(10,150,130,25);
        panel.add(titleLabel);

        titleType = new JComboBox(titleChoice);
        titleType.setBounds(150, 150, 65, 25);
        panel.add(titleType);

        // Creating Title Choices
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10,180,130,25);
        panel.add(genderLabel);

        genderType = new JComboBox(genderChoice);
        genderType.setBounds(150, 180, 65, 25);
        panel.add(genderType);

        // Creating JLabel
        birthLabel = new JLabel("Date of Birth:");
        birthLabel.setBounds(10,210,120,25);
        panel.add(birthLabel);

        userBirth = new JTextField(20);
        userBirth.setBounds(150,210,85,25); //20
        panel.add(userBirth);

        // Creating JLabel
        departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(10,240,120,25);
        panel.add(departmentLabel);

        userDepartment = new JTextField(20);
        userDepartment.setBounds(150,240,85,25); //20
        panel.add(userDepartment);

        // Creating JLabel
        heightLabel = new JLabel("Height:");
        heightLabel.setBounds(10,270,120,25);
        panel.add(heightLabel);

        userHeight = new JTextField(20);
        userHeight.setBounds(150,270,85,25); //20
        panel.add(userHeight);

        // Creating JLabel
        currentWeightLabel = new JLabel("Current Weight:");
        currentWeightLabel.setBounds(10,300,120,25);
        panel.add(currentWeightLabel);

        userCurrentWeight = new JTextField(20);
        userCurrentWeight.setBounds(150,300,85,25); //20
        panel.add(userCurrentWeight);

        // Creating JLabel
        goalWeightLabel = new JLabel("Goal Weight:");
        goalWeightLabel.setBounds(10,330,120,25);
        panel.add(goalWeightLabel);

        userGoalWeight = new JTextField(20);
        userGoalWeight.setBounds(150,330,85,25); //20
        panel.add(userGoalWeight);

        // Creating login button
        submitButton = new JButton("submit");
        submitButton.setBounds(10, 360, 80, 25); //80
        submitButton.addActionListener(newUser.this);
        panel.add(submitButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == submitButton) {
            frame.dispose();
            GUI backToGUI = new GUI();
        }
    }
}
