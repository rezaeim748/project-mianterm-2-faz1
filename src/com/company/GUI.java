package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame enterFrame ;
    private JFrame identityFrameToSignIn ;
    private JFrame identityFrameToSignOut ;
    private JFrame studentSignOutFrame ;
    private JFrame teacherSignOutFrame ;
    private JFrame studentSignInFrame ;
    private JFrame teacherSignInFrame ;
    private JFrame adminSignInFrame ;
    private JFrame studentFrame ;
    private JFrame teacherFrame ;
    private JFrame adminFrame ;



    public GUI (){
        setEnterFrameInfo() ;
        identityFrameToSignIn = new JFrame() ;
        identityFrameToSignOut = new JFrame() ;
        studentSignOutFrame = new JFrame() ;
        teacherSignOutFrame = new JFrame() ;
        studentSignInFrame = new JFrame() ;
        teacherSignInFrame = new JFrame() ;
        adminSignInFrame = new JFrame() ;
        studentFrame = new JFrame() ;
        teacherFrame = new JFrame() ;
        adminFrame = new JFrame() ;
        setIdentityFrameToSignInInfo() ;
        setIdentityFrameToSignOutInfo() ;
        setStudentSignInFrameInfo() ;
        setTeacherSignInFrameInfo() ;
        setAdminSignInFrameInfo() ;
        setStudentSignOutFrameInfo() ;
        setTeacherSignOutFrameInfo() ;


        enterFrame.setVisible(true) ;
    }




    public void setEnterFrameInfo (){
        enterFrame = new JFrame() ;
        enterFrame.setTitle("Enter") ;
        enterFrame.setSize(400, 200) ;
        enterFrame.setLocation(600, 300) ;
        enterFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        enterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addEnterFrameComponents() ;
    }
    public void addEnterFrameComponents (){
        JButton btn = new JButton() ;
        btn.setText("sign out") ;
        addActionListenerToEnterComponents(btn) ;
        enterFrame.add(btn) ;

        btn = new JButton() ;
        btn.setText("sign in") ;
        addActionListenerToEnterComponents(btn) ;
        enterFrame.add(btn) ;
    }


    public void setIdentityFrameToSignInInfo (){
        identityFrameToSignIn.setTitle("identity") ;
        identityFrameToSignIn.setSize(400, 200) ;
        identityFrameToSignIn.setLocation(600, 300) ;
        identityFrameToSignIn.setLayout(new FlowLayout(FlowLayout.CENTER)) ;
        addIdentityFrameToSignInComponents();
    }
    public void addIdentityFrameToSignInComponents (){
        JButton btn = new JButton() ;
        btn.setText("Student") ;
        addActionListenerToSignInComponents(btn) ;
        identityFrameToSignIn.add(btn) ;

        btn = new JButton() ;
        btn.setText("Teacher") ;
        addActionListenerToSignInComponents(btn) ;
        identityFrameToSignIn.add(btn) ;

        btn = new JButton() ;
        btn.setText("Admin") ;
        addActionListenerToSignInComponents(btn) ;
        identityFrameToSignIn.add(btn) ;
    }

    public void setIdentityFrameToSignOutInfo (){
        identityFrameToSignOut.setTitle("identity") ;
        identityFrameToSignOut.setSize(400, 200) ;
        identityFrameToSignOut.setLocation(600, 300) ;
        identityFrameToSignOut.setLayout(new FlowLayout(FlowLayout.CENTER)) ;
        addIdentityFrameToSignOutComponents() ;
    }
    public void addIdentityFrameToSignOutComponents (){
        JButton btn = new JButton() ;
        btn.setText("Student") ;
        addActionListenerToSignOutComponents(btn) ;
        identityFrameToSignOut.add(btn) ;

        btn = new JButton() ;
        btn.setText("Teacher") ;
        addActionListenerToSignOutComponents(btn) ;
        identityFrameToSignOut.add(btn) ;
    }

    public void setStudentSignInFrameInfo (){
        studentSignInFrame.setTitle("sign in") ;
        studentSignInFrame.setSize(400, 200) ;
        studentSignInFrame.setLocation(600, 300) ;
        studentSignInFrame.setLayout(null) ;
        addStudentSignInFrameComponents() ;
    }
    public void addStudentSignInFrameComponents (){
        JLabel usernameLabel = new JLabel("Username : ") ;
        usernameLabel.setSize(150, 40) ;
        usernameLabel.setLocation(0, 10) ;

        JTextField usernameTextField = new JTextField() ;
        usernameTextField.setSize(150, 40) ;
        usernameTextField.setLocation(200, 10);

        JLabel passwordLabel = new JLabel("Password : ") ;
        passwordLabel.setSize(150, 40) ;
        passwordLabel.setLocation(0, 60) ;

        JTextField passwordTextField = new JTextField() ;
        passwordTextField.setSize(150, 40) ;
        passwordTextField.setLocation(200, 60) ;

        JButton OKButton = new JButton("OK") ;
        OKButton.setSize(100, 30) ;
        OKButton.setLocation(150, 110) ;


        studentSignInFrame.add(usernameLabel) ;
        studentSignInFrame.add(usernameTextField) ;
        studentSignInFrame.add(passwordLabel) ;
        studentSignInFrame.add(passwordTextField) ;
        studentSignInFrame.add(OKButton) ;
    }

    public void setTeacherSignInFrameInfo (){
        teacherSignInFrame.setTitle("sign in") ;
        teacherSignInFrame.setSize(400, 200);
        teacherSignInFrame.setLocation(600, 300) ;
        teacherSignInFrame.setLayout(null) ;
        addTeacherSignInFrameComponents() ;
    }
    public void addTeacherSignInFrameComponents (){
        JLabel usernameLabel = new JLabel("Username : ") ;
        usernameLabel.setSize(150, 40) ;
        usernameLabel.setLocation(0, 10) ;

        JTextField usernameTextField = new JTextField() ;
        usernameTextField.setSize(150, 40) ;
        usernameTextField.setLocation(200, 10);

        JLabel passwordLabel = new JLabel("Password : ") ;
        passwordLabel.setSize(150, 40) ;
        passwordLabel.setLocation(0, 60) ;

        JTextField passwordTextField = new JTextField() ;
        passwordTextField.setSize(150, 40) ;
        passwordTextField.setLocation(200, 60) ;

        JButton OKButton = new JButton("OK") ;
        OKButton.setSize(100, 30) ;
        OKButton.setLocation(150, 110) ;


        teacherSignInFrame.add(usernameLabel) ;
        teacherSignInFrame.add(usernameTextField) ;
        teacherSignInFrame.add(passwordLabel) ;
        teacherSignInFrame.add(passwordTextField) ;
        teacherSignInFrame.add(OKButton) ;
    }

    public void setAdminSignInFrameInfo (){
        adminSignInFrame.setTitle("sign in") ;
        adminSignInFrame.setSize(400, 200);
        adminSignInFrame.setLocation(600, 300) ;
        adminSignInFrame.setLayout(null) ;
        addAdminSignInFrameComponents() ;
    }
    public void addAdminSignInFrameComponents (){
        JLabel usernameLabel = new JLabel("Username : ") ;
        usernameLabel.setSize(150, 40) ;
        usernameLabel.setLocation(0, 10) ;

        JTextField usernameTextField = new JTextField() ;
        usernameTextField.setSize(150, 40) ;
        usernameTextField.setLocation(200, 10);

        JLabel passwordLabel = new JLabel("Password : ") ;
        passwordLabel.setSize(150, 40) ;
        passwordLabel.setLocation(0, 60) ;

        JTextField passwordTextField = new JTextField() ;
        passwordTextField.setSize(150, 40) ;
        passwordTextField.setLocation(200, 60) ;

        JButton OKButton = new JButton("OK") ;
        OKButton.setSize(100, 30) ;
        OKButton.setLocation(150, 110) ;


        adminSignInFrame.add(usernameLabel) ;
        adminSignInFrame.add(usernameTextField) ;
        adminSignInFrame.add(passwordLabel) ;
        adminSignInFrame.add(passwordTextField) ;
        adminSignInFrame.add(OKButton) ;
    }

    public void setStudentSignOutFrameInfo (){
        studentSignOutFrame.setTitle("sign in") ;
        studentSignOutFrame.setSize(400, 200);
        studentSignOutFrame.setLocation(600, 300) ;
        studentSignOutFrame.setLayout(null) ;
        addStudentSignOutFrameComponents() ;
    }
    public void addStudentSignOutFrameComponents (){
        JLabel usernameLabel = new JLabel("Username : ") ;
        usernameLabel.setSize(150, 40) ;
        usernameLabel.setLocation(0, 10) ;

        JTextField usernameTextField = new JTextField() ;
        usernameTextField.setSize(150, 40) ;
        usernameTextField.setLocation(200, 10);

        JLabel passwordLabel = new JLabel("Password : ") ;
        passwordLabel.setSize(150, 40) ;
        passwordLabel.setLocation(0, 60) ;

        JTextField passwordTextField = new JTextField() ;
        passwordTextField.setSize(150, 40) ;
        passwordTextField.setLocation(200, 60) ;

        JButton OKButton = new JButton("OK") ;
        OKButton.setSize(100, 30) ;
        OKButton.setLocation(150, 110) ;


        studentSignOutFrame.add(usernameLabel) ;
        studentSignOutFrame.add(usernameTextField) ;
        studentSignOutFrame.add(passwordLabel) ;
        studentSignOutFrame.add(passwordTextField) ;
        studentSignOutFrame.add(OKButton) ;
    }

    public void setTeacherSignOutFrameInfo (){
        teacherSignOutFrame.setTitle("sign in") ;
        teacherSignOutFrame.setSize(400, 200);
        teacherSignOutFrame.setLocation(600, 300) ;
        teacherSignOutFrame.setLayout(null) ;
        addTeacherSignOutFrameComponents() ;
    }
    public void addTeacherSignOutFrameComponents (){
        JLabel usernameLabel = new JLabel("Username : ") ;
        usernameLabel.setSize(150, 40) ;
        usernameLabel.setLocation(0, 10) ;

        JTextField usernameTextField = new JTextField() ;
        usernameTextField.setSize(150, 40) ;
        usernameTextField.setLocation(200, 10);

        JLabel passwordLabel = new JLabel("Password : ") ;
        passwordLabel.setSize(150, 40) ;
        passwordLabel.setLocation(0, 60) ;

        JTextField passwordTextField = new JTextField() ;
        passwordTextField.setSize(150, 40) ;
        passwordTextField.setLocation(200, 60) ;

        JButton OKButton = new JButton("OK") ;
        OKButton.setSize(100, 30) ;
        OKButton.setLocation(150, 110) ;


        teacherSignOutFrame.add(usernameLabel) ;
        teacherSignOutFrame.add(usernameTextField) ;
        teacherSignOutFrame.add(passwordLabel) ;
        teacherSignOutFrame.add(passwordTextField) ;
        teacherSignOutFrame.add(OKButton) ;
    }












    public void addActionListenerToEnterComponents (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource() ;
                switch (button.getText()){
                    case "sign in" :
                        identityFrameToSignIn.setVisible(true) ;
                        break ;
                    case "sign out" :
                        identityFrameToSignOut.setVisible(true) ;
                        break ;
                    default :
                        break ;
                }

            }
        });
    }

    public void addActionListenerToSignOutComponents (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource() ;
                identityFrameToSignOut.setVisible(false) ;
                switch (button.getText()){
                    case "Student" :
                        studentSignOutFrame.setVisible(true) ;
                        break ;
                    case "Teacher" :
                        teacherSignOutFrame.setVisible(true) ;
                        break ;
                    default :
                        break ;
                }
            }
        });
    }

    public void addActionListenerToSignInComponents (JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource() ;
                identityFrameToSignIn.setVisible(false) ;
                switch (button.getText()){
                    case "Student" :
                        studentSignInFrame.setVisible(true) ;
                        break ;
                    case "Teacher" :
                        teacherSignInFrame.setVisible(true) ;
                        break ;
                    case "Admin" :
                        adminSignInFrame.setVisible(true) ;
                        break ;
                }
            }
        });
    }


}
