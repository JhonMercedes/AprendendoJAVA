package lojaonline;

public abstract class Produto {

	private int codigo;
	private String nome;
	private double valor;
	
	//Constructor
	public Produto (int codigo, String nome, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		
	}
	
	//Getters e setters 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Method abstract sem corpo
	abstract String obterDescricao();
	
	
}