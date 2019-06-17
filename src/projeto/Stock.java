package projeto;

import java.util.ArrayList;

/**
 * Esta classe serve para disponibilizar o stock de artigos que estão disponiveis
 * @author Luis Bispo, José Boieiro, Carolina Timóteo
 *
 */

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
				/**
				 * Construtor do stock com os artigos disponiveis
				 * @param stock dos artigos
				 */
				public Stock(ArrayList stock) {
					Stock = stock;
				}
				
	// METODOS
				/**
				 * Serve para adicionar um artigo ao stock
				 * @param artigo a ser adicionado ao stock
				 */
				public void add(Artigo artigo) {
					Stock.add(0, artigo);
				}
				/**
				 * Serve para mostrar o tamanho atual do stock
				 * @return Tamanho do stock
				 */
				public int size() {
					return Stock.size();
				}
				/**
				 * Serve para remover um artigo do stock
				 * @param remove o artigo do stock
				 */
				public void remove() {
					Stock.remove(0);
				}
	
}
