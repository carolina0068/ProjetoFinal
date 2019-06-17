package projeto;

public class Artigo{
	// ATRIBUTOS
	protected int codigo_Artigo;
	protected String descricao;
	protected int preco;
	protected double desconto;
	
	// ACESSORES
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo_Artigo() {
		return codigo_Artigo;
	}
	public void setCodigo_Artigo(int codigo_Artigo) {
		this.codigo_Artigo = codigo_Artigo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	// CONSTRUTORES
	public Artigo() {
		super();
	}
	
	public Artigo(int codigo_Artigo, String descricao, int preco, double desconto) {
		super();
		this.codigo_Artigo = codigo_Artigo;
		this.descricao = descricao;
		this.preco = preco;
		this.desconto = desconto;
	}

	// METODOS
	public double calcularPrecoTotal() {
		return preco * 1 - desconto; 	
	}

}
