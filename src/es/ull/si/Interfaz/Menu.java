package es.ull.si.Interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Menu extends JFrame{

	private MainMenu menuPrincipal;
    
    public Menu(){
    	 
    	super("Compañia de Artesanos en Tenerife");
    	
    	setTitle("Compañia de Artesanos en Tenerife");
        setLookAndFeel();
        
        setBounds(0, 0, 1000000, 1000000);
 
        // Cerramos la aplicación cuando cerremos la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Color background = new Color(200,150,0);
        setBackground(background);

        menuPrincipal = new MainMenu (this);
        menuPrincipal.setComponents("Compañia de Artesanos en Tenerife", background);

        setContentPane(menuPrincipal);

        getContentPane().setBackground(background);
        
        setVisible(true);
    }

	private void setLookAndFeel(){
    	
    	try {
    		
    		UIManager.setLookAndFeel(
    				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
    				);
    		} catch (Exception exc) {
                
    			// ignore error
            }
        }
}