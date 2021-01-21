package lojaonline;

public class Notebook extends Produto {
	
	private String cpu;
	private String memoria;
	private String armazenamento;
	
	//Constructor 
	public Notebook (int codigo, String nome, double valor, 
			String cpu, String memoria, String armazenamento) {
		super(codigo, nome, valor);
		
		this.cpu = cpu;
		this.memoria = memoria;
		this.armazenamento = armazenamento;
	}
	
	//Getters e Setters 
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	@Override
	public String obterDescricao() {
		 String desc = "Cod.:" + getCodigo() + "\t" +
				 		"Nome:" + getNome() + "\n" +
				 		"Marca: " + getCpu() + "\t" +
				 		"Modelo: " + getArmazenamento() + "\n" +
				 		"Caracteristicas: " + getMemoria() +
				 		"Valor: R$" + getValor();
   return desc;
	}

}
