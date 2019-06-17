package projeto;

public class MAIN {

	public static void main(String[] args) {
		
		Stock queue = new Stock();
		
		Artigo a1 = new Artigo(1, "Pc", 10, 0.20);
		queue.add(a1);
		queue.add(new Artigo(3, "Colunas", 90, 0));
		for (int i = 0; i < queue.size(); i++) {
			System.out.println("Artigo nº " + queue.get(i).getCodigo_Artigo() + ": " + queue.get(i).getDescricao() + ", " 
					+ queue.get(i).getPreco() + "€, " + queue.get(i).getDesconto());
		}
		if (queue.size() == 0) {
			System.out.println("Esta vazio diz");
		}
		
	}

}
