package es.ull.si.Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProdMat extends JPanel implements ActionListener{

	private JFrame menu_;
	private JPanel mainMenu_;
	
	private JButton btnHome_;
	
	public ProdMat(JFrame menu, JPanel mainMenu){
		
		super();
		
		menu_ = menu;
		mainMenu_ = mainMenu;
	}

	public void setComponents(String title, Color background) {

        setBackground(background);
        setLayout(new BorderLayout());
        setTitle(title);
        setButtons(background);
	}
	
	private void setTitle(String title){
		
		Font font = new Font("Tahoma", Font.BOLD, 30);
        
        JLabel myTitle = new JLabel(title);
        myTitle.setFont(font);
        myTitle.setBounds(60, 20, 600, 200);
        add (myTitle, BorderLayout.NORTH);
		
	}
	
	private void setButtons(Color background) {
		
		JPanel bar1 = new JPanel();
		bar1.setLayout(new FlowLayout());
		bar1.setBackground(background);
		
		Color btnBck = new Color(0, 153, 0);
		
		//Botón Home
        btnHome_ = new JButton("Home");
        btnHome_.setBackground(btnBck);
        btnHome_.setForeground(Color.WHITE);
        bar1.add(btnHome_);
        btnHome_.addActionListener(this);
        
        add(bar1, BorderLayout.NORTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnHome_){
			
			menu_.remove(this);
			this.setVisible(false);
			menu_.setContentPane(mainMenu_);
			menu_.setVisible(true);

		}
	}
}