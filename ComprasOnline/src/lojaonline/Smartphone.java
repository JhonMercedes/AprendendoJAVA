package lojaonline;

public class Smartphone extends Produto {
	
	private String marca;
	private String modelo;
	private String memoria;
	private String tela;

	//Contructor 
	public Smartphone(int codigo, String nome, double valor ,
			String marca,String modelo, String memoria, String tela) {
		super(codigo, nome, valor);
		
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.tela = tela; 
	}
	
	//Getter e Setters 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	
	@Override
    public String obterDescricao() {
        String desc = "Cod.:" + getCodigo() + "\t" +
                      "Nome:" + getNome() + "\n" +
                      "Marca: " + getMarca() + "\t" +
                      "Modelo: " + getModelo() + "\n" +
                      "Caracteristicas: " + getMemoria() +
                      ", tela: " + getTela() + "\n" +
                      "Valor: R$" + getValor();
        return desc;
    }
	
	
}
