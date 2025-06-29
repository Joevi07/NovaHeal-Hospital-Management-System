/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagement;

/**
 *
 * @author riyajoe07
 */
public class LoginAndSignup {
    public static void main(String[] args) {
        try{

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
