package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsAdapter;

public class AdminProfile {
    private JFrame adminFrame ;
    private JPanel column ;
    private JPanel personal ;
    private JPanel mealSchedule ;
    private JPanel lists ;
    private JPanel addMember ;


    public AdminProfile (){

    }


    public void setVisibility (boolean visibility){
        adminFrame.setVisible(visibility) ;
    }


    public void setAdminProfileInfo (){
        adminFrame = new JFrame() ;
        adminFrame.setTitle("Admin profile") ;
        adminFrame.setSize(1000, 600) ;
        adminFrame.setLocation(100, 100) ;
        adminFrame.setLayout(new BorderLayout()) ;
        addAdminFrameComponents() ;
    }
    public void addAdminFrameComponents (){
        column = new JPanel() ;
        personal = new JPanel() ;
        mealSchedule = new JPanel() ;
        lists = new JPanel() ;
        addMember = new JPanel() ;

        addColumnComponents() ;
        addPersonalComponents() ;
        addMealScheduleComponents() ;
        addListsComponents() ;
        addAddMemberComponents() ;

        adminFrame.add(column, BorderLayout.EAST) ;
        adminFrame.add(personal, BorderLayout.CENTER) ;
    }

    public void addColumnComponents (){
        column.setLayout(new GridLayout(4, 1)) ;
        JButton btn = new JButton("personal") ;
        addActionListenerToPersonalButton(btn) ;
        column.add(btn) ;

        btn = new JButton("mealSchedule") ;
        addActionListenerToMealScheduleButton(btn) ;
        column.add(btn) ;

        btn = new JButton("lists") ;
        addActionListenerToListsButton(btn) ;
        column.add(btn) ;

        btn = new JButton("addMember") ;
        addActionListenerToAddMemberButton(btn) ;
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

    public void addMealScheduleComponents (){
        mealSchedule.setLayout(new GridLayout(5, 3)) ;
        JLabel label = new JLabel("Saturday : ") ;
        mealSchedule.add(label) ;

        label = new JLabel() ;
        mealSchedule.add(label) ;

        JButton btn = new JButton("Save") ;
        mealSchedule.add(btn) ;

        label = new JLabel("Sunday : ") ;
        mealSchedule.add(label) ;

        label = new JLabel() ;
        mealSchedule.add(label) ;

        btn = new JButton("Save") ;
        mealSchedule.add(btn) ;

        label = new JLabel("Monday : ") ;
        mealSchedule.add(label) ;

        label = new JLabel() ;
        mealSchedule.add(label) ;

        btn = new JButton("Save") ;
        mealSchedule.add(btn) ;

        label = new JLabel("Tuesday : ") ;
        mealSchedule.add(label) ;

        label = new JLabel() ;
        mealSchedule.add(label) ;

        btn = new JButton("Save") ;
        mealSchedule.add(btn) ;

        label = new JLabel("wednesday : ") ;
        mealSchedule.add(label) ;

        label = new JLabel() ;
        mealSchedule.add(label) ;

        btn = new JButton("Save") ;
        mealSchedule.add(btn) ;
    }

    public void addListsComponents (){
        lists.setLayout(new GridLayout(1, 3)) ;
        JButton btn = new JButton("Students") ;
        lists.add(btn) ;

        btn = new JButton("Teachers") ;
        lists.add(btn) ;

        btn = new JButton("Classes") ;
        lists.add(btn) ;
    }

    public void addAddMemberComponents (){
        addMember.setLayout(new GridLayout(2, 1)) ;
        JButton btn = new JButton("Student") ;
        addMember.add(btn) ;

        btn = new JButton("Teacher") ;
        addMember.add(btn) ;
    }























    public void addActionListenerToPersonalButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminFrame.add(personal, BorderLayout.CENTER) ;
            }
        });
    }
    public void addActionListenerToMealScheduleButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminFrame.add(mealSchedule, BorderLayout.CENTER) ;
            }
        });
    }
    public void addActionListenerToListsButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminFrame.add(lists, BorderLayout.CENTER) ;
            }
        });
    }
    public void addActionListenerToAddMemberButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminFrame.add(addMember, BorderLayout.CENTER) ;
            }
        });
    }
}
