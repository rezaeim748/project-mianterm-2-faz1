package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentProfile {
    private JFrame studentFrame ;
    private JPanel column ;
    private JPanel personal ;
    private JPanel classes ;
    private JPanel account ;
    private JPanel mealReserve ;
    private JPanel classChoosing ;
    private JPanel centerPanel ;
    // private com.company.Student student ;


    public StudentProfile (){
        // student = new com.company.Student(username, password) ;
        centerPanel = new JPanel() ;
        setStudentProfileInfo() ;


    }

    public void setVisibility (boolean visibility){
        studentFrame.setVisible(visibility) ;
    }

    public void setStudentProfileInfo (){
        studentFrame = new JFrame() ;
        studentFrame.setTitle("Student profile") ;
        studentFrame.setSize(1000, 600) ;
        studentFrame.setLocation(100, 100) ;
        studentFrame.setLayout(new BorderLayout()) ;
        addStudentFrameComponents() ;
    }
    public void addStudentFrameComponents (){
        column = new JPanel() ;
        classes = new JPanel() ;
        personal = new JPanel() ;
        account = new JPanel() ;
        mealReserve = new JPanel() ;
        classChoosing = new JPanel() ;

        addColumnComponents() ;
        addPersonalComponents() ;
        addClassesComponents() ;
        addAccountComponents() ;
        addMealReserveComponents() ;
        addClassChoosingComponents() ;

        studentFrame.add(column, BorderLayout.EAST) ;
        studentFrame.add(centerPanel, BorderLayout.CENTER) ;
    }

    public void addColumnComponents (){
        column.setLayout(new GridLayout(5, 1)) ;
        JButton btn = new JButton("personal") ;
        addActionListenerToPersonalButton(btn);
        column.add(btn) ;

        btn = new JButton("classes") ;
        addActionListenerToClassesButton(btn);
        column.add(btn) ;

        btn = new JButton("account") ;
        addActionListenerToAccountButton(btn);
        column.add(btn) ;

        btn = new JButton("mealReserve") ;
        addActionListenerToMealReserveButton(btn);
        column.add(btn) ;

        btn = new JButton("classChoosing") ;
        addActionListenerToClassChoosingButton(btn);
        column.add(btn) ;
    }

    public void addPersonalComponents (){
        personal.setLayout(new GridLayout(3, 2)) ;
        JLabel label = new JLabel("Username : ") ;
        personal.add(label) ;

        label = new JLabel() ; // it comes from sign out frame
        personal.add(label) ;

        label = new JLabel("Password : ") ;
        personal.add(label) ;

        label = new JLabel() ;
        personal.add(label) ;

        JButton btn = new JButton("Change username and password") ;
        personal.add(btn) ;
    }

    public void addClassesComponents (){
        classes.setLayout(new GridLayout(10, 1)) ;
        // undone ...
    }

    public void addAccountComponents (){
        account.setLayout(new GridLayout(3, 3)) ;
        JLabel label = new JLabel("Card number : ") ;
        account.add(label) ;

        label = new JLabel() ;
        account.add(label) ;

        JButton btn = new JButton("Change card number") ;
        account.add(btn) ;

        label = new JLabel("Password : ") ;
        account.add(label) ;

        label = new JLabel() ;
        account.add(label) ;

        btn = new JButton("Change password") ;
        account.add(btn) ;

        label = new JLabel("Balance : ") ;
        account.add(label) ;

        label = new JLabel() ;
        account.add(label) ;

        btn = new JButton("Change balance") ;
        account.add(btn) ;
    }

    public void addMealReserveComponents (){
        mealReserve.setLayout(new GridLayout(5, 4)) ;
        JLabel label = new JLabel("Saturday : ") ;
        mealReserve.add(label) ;

        label = new JLabel() ;
        mealReserve.add(label) ;

        JButton btn = new JButton("Reserve") ;
        mealReserve.add(btn) ;

        btn = new JButton("Cancel") ;
        mealReserve.add(btn) ;

        label = new JLabel("Sunday : ") ;
        mealReserve.add(label) ;

        label = new JLabel() ;
        mealReserve.add(label) ;

        btn = new JButton("Reserve") ;
        mealReserve.add(btn) ;

        btn = new JButton("Cancel") ;
        mealReserve.add(btn) ;

        label = new JLabel("Monday : ") ;
        mealReserve.add(label) ;

        label = new JLabel() ;
        mealReserve.add(label) ;

        btn = new JButton("Reserve") ;
        mealReserve.add(btn) ;

        btn = new JButton("Cancel") ;
        mealReserve.add(btn) ;

        label = new JLabel("Tuesday : ") ;
        mealReserve.add(label) ;

        label = new JLabel() ;
        mealReserve.add(label) ;

        btn = new JButton("Reserve") ;
        mealReserve.add(btn) ;

        btn = new JButton("Cancel") ;
        mealReserve.add(btn) ;

        label = new JLabel("wednesday : ") ;
        mealReserve.add(label) ;

        label = new JLabel() ;
        mealReserve.add(label) ;

        btn = new JButton("Reserve") ;
        mealReserve.add(btn) ;

        btn = new JButton("Cancel") ;
        mealReserve.add(btn) ;
    }

    public void addClassChoosingComponents (){
        classChoosing.setLayout(new GridLayout(2, 2)) ;
        JLabel label = new JLabel("Units number : ") ;
        classChoosing.add(label) ;

        label = new JLabel() ;
        classChoosing.add(label) ;

        JButton btn = new JButton("Your classes") ;
        classChoosing.add(btn) ;

        btn = new JButton("Choose new class") ;
        classChoosing.add(btn) ;
    }

    public void updateStudentFrame (JPanel panel){
        setVisibility(false) ;
        centerPanel = panel ;
        setStudentProfileInfo();
        setVisibility(true) ;
    }

























    public void addActionListenerToPersonalButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // removing previous panel ...
                updateStudentFrame(personal) ;
            }
        });
    }
    public void addActionListenerToClassesButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudentFrame(classes) ;
            }
        });
    }
    public void addActionListenerToAccountButton (JButton btn) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                updateStudentFrame(account) ;
            }
        });
    }
    public void addActionListenerToMealReserveButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                updateStudentFrame(mealReserve) ;
            }
        });
    }
    public void addActionListenerToClassChoosingButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                updateStudentFrame(classChoosing) ;
            }
        });
    }


}
