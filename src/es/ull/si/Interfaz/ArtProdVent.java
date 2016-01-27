package es.ull.si.Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import es.ull.bbdd.query.QueryArtesano;

public class ArtProdVent extends JPanel implements ActionListener{

	private JFrame menu_;
	private JPanel mainMenu_;
	
	private JButton btnHome_;
	
	public ArtProdVent(JFrame menu, JPanel mainMenu){
		
		super();
		
		menu_ = menu;
		mainMenu_ = mainMenu;
	}
	
	public void setComponents(String title, Color background) {

        setBackground(background);
        setLayout(new BorderLayout());
        setData(background);
        setButtons(background);
	}
	
	private void setData(Color background) {
		
		QueryArtesano consulta = new QueryArtesano();
		
		JPanel pText = new JPanel();
		
		pText.setBackground(background);
		
		Font font = new Font("Tahoma", Font.BOLD, 15);
        
        JLabel myTitle1 = new JLabel("Artesanos:");
        myTitle1.setFont(font);
        pText.add(myTitle1);
		
		String datosArt = consulta.artesanoDatos();
		
		JTextField datos = new JTextField(datosArt);
	    pText.add(datos);
		
        JLabel myTitle2 = new JLabel("Fabrica:");
        myTitle2.setFont(font);
        pText.add(myTitle2);
		
		datosArt = consulta.artesanoFabrica();
		
		datos = new JTextField(datosArt);
	    pText.add(datos);
	    
        JLabel myTitle3 = new JLabel("Artesanos:");
        myTitle3.setFont(font);
        pText.add(myTitle3);
		
		datosArt = consulta.artesanoVenta();
		
		datos = new JTextField(datosArt);
	    pText.add(datos);

		add(pText, BorderLayout.CENTER);

		
		
		consulta.close();
		

		
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
