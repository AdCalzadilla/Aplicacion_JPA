package main;
import java.util.Vector;
import javax.persistence.*;

import es.ull.bbdd.query.QueryArtesano;
import es.ull.si.Interfaz.Menu;

public class APP {
	
	public static void main(String[] args){
		
	        Menu MyMenu = new Menu();
	        QueryArtesano consulta1 = new QueryArtesano();
	        
	        consulta1.artesanoDatos();
	        consulta1.close();
	        
	}
}
