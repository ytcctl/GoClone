/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goclone;

import java.awt.EventQueue;

/**
 *@version 0.1 2023-10-13
 * @author Peter Choi
 */
public class GoClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         EventQueue.invokeLater(() -> {
            new CloneFrame();
         });
         
        
        
         
    }
    
}
