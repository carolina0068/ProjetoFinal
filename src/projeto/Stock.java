package projeto;

import java.util.ArrayList;

public class Stock {
	
	// ATRIBUTOS
	
				//@Override
				protected ArrayList<Artigo> Stock = new ArrayList<Artigo>();
	
	// ACESSORES

				public ArrayList getStock() {
					return Stock;
				}

				public void setStock(ArrayList stock) {
					Stock = stock;
				}
				public Artigo get(int i) {
					return (Artigo) Stock.get(i);
				}
				
				
				
	// CONSTRUTORES
				
				public Stock() {
				}
				
				public Stock(ArrayList stock) {
					Stock = stock;
				}
				
	// METODOS
				
				public void add(Artigo artigo) {
					Stock.add(0, artigo);
				}
				
				public int size() {
					return Stock.size();
				}
				public void remove() {
					Stock.remove(0);
				}
	
}
