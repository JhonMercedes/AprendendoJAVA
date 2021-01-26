package model;

public class Chamado {

    private int codigo_chamado ;
    private String descricao ;
    private int filial ;
		
    public int getCodigo_chamado() {
	return codigo_chamado;
	}
    public void setCodigo_chamado(int codigo_chamado) {
	this.codigo_chamado = codigo_chamado;
	}
    public String getDescricao() {
	return descricao;
	}
    public void setDescricao(String descricao) {
	this.descricao = descricao;
	}
    public int getFilial() {
	return filial;
	}
    public void setFilial(int filial) {
	this.filial = filial;
	}

}
