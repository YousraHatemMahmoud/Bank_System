/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank_system;

/**
 *
 * @author HP
 */
public class Bank_System {

    public static void main(String[] args) {
        // Launch the Login frame
        java.awt.EventQueue.invokeLater(() -> {
            new com.bank.Login().setVisible(true);
        });
    }
}