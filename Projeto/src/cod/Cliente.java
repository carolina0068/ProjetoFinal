package cod;

public class Cliente {

	//Atributos
	
	protected String codCliente;
	protected String nomeCliente;
	protected String morada;
	protected String codigoPostal;
	
	//Acessores
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	//Construtores
	
	public Cliente() {
	}
	
	public Cliente(String codCliente, String nomeCliente, String morada, String codigoPostal) {
		
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.morada = morada;
		this.codigoPostal = codigoPostal;
	}
	
	//Metodos
	
	protected String mostrarListaClientes(boolean tO) {
		if(tO==false) {
			return nomeCliente;	
		}
		else {
			return codCliente;
		}
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nomeCliente=" + nomeCliente + ", morada=" + morada
				+ ", codigoPostal=" + codigoPostal + "]";
	}
	
}
