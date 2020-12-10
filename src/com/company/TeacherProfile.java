package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherProfile {
    private JFrame teacherFrame ;
    private JPanel column ;
    private JPanel personal ;
    private JPanel classes ;
    private JPanel addClass ;

    public TeacherProfile (){
        setTeacherProfileInfo() ;
    }

    public void setVisibility (boolean visibility){
        teacherFrame.setVisible(visibility) ;
    }

    public void setTeacherProfileInfo (){
        teacherFrame = new JFrame() ;
        teacherFrame.setTitle("Admin profile") ;
        teacherFrame.setSize(1000, 600) ;
        teacherFrame.setLocation(100, 100) ;
        teacherFrame.setLayout(new BorderLayout()) ;
        addTeacherFrameComponents() ;
    }

    public void addTeacherFrameComponents (){
        column = new JPanel() ;
        personal = new JPanel() ;
        classes = new JPanel() ;
        addClass = new JPanel() ;

        addColumnComponents() ;
        addPersonalComponents() ;
        addClassesComponents() ;
        addAddClassComponents() ;

        teacherFrame.add(column, BorderLayout.EAST) ;
        teacherFrame.add(personal, BorderLayout.CENTER) ;
    }

    public void addColumnComponents (){
        column.setLayout(new GridLayout(4, 1)) ;
        JButton btn = new JButton("personal") ;
        addActionListenerToPersonalButton(btn) ;
        column.add(btn) ;

        btn = new JButton("classes") ;
        addActionListenerToClassesButton(btn) ;
        column.add(btn) ;

        btn = new JButton("addClass") ;
        addActionListenerToAddClassButton(btn) ;
        column.add(btn) ;

    }



































    public void addActionListenerToPersonalButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherFrame.add(personal, BorderLayout.CENTER) ;
            }
        });
    }
    public void addActionListenerToClassesButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherFrame.add(classes, BorderLayout.CENTER) ;
            }
        });
    }
    public void addActionListenerToAddClassButton (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherFrame.add(addClass, BorderLayout.CENTER) ;
            }
        });
    }





}
