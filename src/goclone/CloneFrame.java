/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goclone;
import java.awt.*;
import javax.swing.*;
/**
 *@version 0.1 2023-10-13
 * @author Peter Choi
 */
public class CloneFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    
    public CloneFrame(){
        String dir = System.getProperty("user.dir");
       
        EventQueue.invokeLater(() -> {
            //Get the source of ICON image
            Image icon = Toolkit.getDefaultToolkit().getImage(dir + "\\256w\\ArtBoard 1.png");
            //Set Panel
            JPanel mainPanel = new JPanel();
            JPanel subPanel1 = new JPanel();
            JPanel subPanel2 = new JPanel();
            JTextField aTextField = new JTextField(10);
            JTextField bTextField = new JTextField(10);
            JButton aButton = new JButton("Source Folder");
            JButton bButton = new JButton("Destination Folder");
            
            getContentPane().add(mainPanel, BorderLayout.CENTER);
            
            mainPanel.add(aButton,BorderLayout.NORTH);
            mainPanel.add(aTextField,BorderLayout.NORTH);
            
            mainPanel.add(bButton,BorderLayout.SOUTH);
            mainPanel.add(bTextField,BorderLayout.SOUTH);
            
            
            //Set ICON
            setIconImage(icon);
            //Set Size
            //setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            //Set Close Operation
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Go Clone!");
            //Set the location of the frame 
            setLocationRelativeTo(null);
            setVisible(true);
            pack();
        });
       
        
    }
    
}