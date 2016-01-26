package es.ull.si.Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel implements ActionListener{
	
	private JFrame menu_;
	
	private JButton btnArtProdVent;
	private JButton btnProdMat;
	
	private Color background;
	
	public MainMenu(JFrame menu){
		
		super();
		setLayout(new BorderLayout());
		
		menu_ = menu;
		
		setImage();
	}
	
	private void setImage() {
		
		String pathGeneral = System.getProperty("user.dir");
		
		String path = pathGeneral + "/images/artesano.jpg";

		
		ImageIcon Imagen0 = new ImageIcon(path);
		JLabel Img0 = new JLabel(Imagen0);
		Img0.setSize(380,380);
		add(Img0, BorderLayout.EAST);
		Icon icono0 = new ImageIcon(Imagen0.getImage().getScaledInstance(Img0.getWidth(), Img0.getHeight(), 10));
		Img0.setIcon(icono0); 
		Img0.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 100));
		add(Img0, BorderLayout.EAST);
		
		path = pathGeneral + "/images/grabados.jpg";
		
		ImageIcon Imagen1 = new ImageIcon(path); 
		JLabel Img1 = new JLabel(Imagen1);
		Img1.setSize(380,380);
		Icon icono1 = new ImageIcon(Imagen1.getImage().getScaledInstance(Img1.getWidth(), Img1.getHeight(), 10));
		Img1.setIcon(icono1); 
		Img1.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 0));
		add(Img1, BorderLayout.WEST);
		
		path = pathGeneral + "/images/muñecas.jpg";
		
		ImageIcon Imagen2 = new ImageIcon(path); 
		JLabel Img2 = new JLabel(Imagen2);
		Img2.setSize(380,380);
		Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(Img2.getWidth(), Img2.getHeight(), 10));
		Img2.setIcon(icono2); 
		add(Img2, BorderLayout.CENTER);
		
		
		
	}

	public void setComponents(String title, Color background) {
		
		setBackground(background);
		setTitle(title);
        setButtons(background);
        
        this.background = background;
	}
	
	private void setTitle(String title){
		
		Font font = new Font("Tahoma", Font.BOLD, 30);
        
        JLabel myTitle = new JLabel(title);
        myTitle.setFont(font);
        myTitle.setBounds(60, 20, 600, 200);
        add (myTitle, BorderLayout.NORTH);
		
	}
    
    private void setButtons(Color background) {
    	
    	setDescriptionBar(background);
        
        JPanel bar = new JPanel();
		bar.setLayout(new FlowLayout());
		bar.setBackground(background);
		
    	Color btnBck = new Color(0, 153, 0);
        
        //Botón Artesano
        btnArtProdVent = new JButton("Ficha artesano");
        btnArtProdVent.setBounds(123, 533, 130, 60);
        btnArtProdVent.setBackground(btnBck);
        btnArtProdVent.setForeground(Color.WHITE);
        bar.add(btnArtProdVent);
        btnArtProdVent.addActionListener(this);
        
        //Botón Productos
        btnProdMat = new JButton("Productos y materiales");
        btnProdMat.setBounds(353, 533, 130, 60);
        btnProdMat.setBackground(btnBck);
        btnProdMat.setForeground(Color.WHITE);
        bar.add(btnProdMat);
        btnProdMat.addActionListener(this);
        
        add(bar, BorderLayout.SOUTH);
		
	}
    
    private void setDescriptionBar(Color background){
		
		JPanel bar = new JPanel();
		bar.setLayout(new FlowLayout());
		bar.setBackground(background);
        
        add(bar, BorderLayout.NORTH);
		
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnArtProdVent){
			
			ArtProdVent artProdVent = new ArtProdVent(menu_, this);
	        artProdVent.setComponents("Artesanos, Productos y Ventas", background);
	        
	        menu_.setContentPane(artProdVent);	        
	        menu_.setVisible(true);
			
		}
		
		if(e.getSource() == btnProdMat){
			
			ProdMat prodMat = new ProdMat(menu_, this);
	        prodMat.setComponents("Productos y sus materiales", background);
	        menu_.setContentPane(prodMat);	        
	        menu_.setVisible(true);
		}
		
	}
}