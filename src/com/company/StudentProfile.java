package com.company;

import javax.swing.*;
import java.awt.*;

public class StudentProfile {
    private JFrame studentFrame ;
    private JPanel column ;
    private JPanel personal ;
    private JPanel classes ;
    private JPanel account ;
    private JPanel mealReserve ;
    private JPanel classChoosing ;


    public StudentProfile (){
        setStudentFrameInfo() ;


    }

    public void setStudentFrameInfo (){
        studentFrame = new JFrame() ;
        studentFrame.setTitle("Student profile") ;
        studentFrame.setSize(1000, 600) ;
        studentFrame.setLocation(100, 100) ;
        studentFrame.setLayout(new BorderLayout()) ;
        addStudentFrameComponents() ;
    }
    public void addStudentFrameComponents (){
        column = new JPanel() ;
        personal = new JPanel() ;
        classes = new JPanel() ;
        account = new JPanel() ;
        mealReserve = new JPanel() ;
        classChoosing = new JPanel() ;


        addColumnComponents() ;
        addPersonalComponents() ;
        addClassesComponents() ;
        addAccountComponents() ;
        addMealReserveComponents() ;
        // ...
    }

    public void addColumnComponents (){
        column.setLayout(new GridLayout(5, 1)) ;
        JButton btn = new JButton() ;
        btn.setText("personal") ;
        column.add(btn) ;

        btn = new JButton("classes") ;
        column.add(btn) ;

        btn = new JButton("account") ;
        column.add(btn) ;

        btn = new JButton("mealReserve") ;
        column.add(btn) ;

        btn = new JButton("classChoosing") ;
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
        
    }




}
