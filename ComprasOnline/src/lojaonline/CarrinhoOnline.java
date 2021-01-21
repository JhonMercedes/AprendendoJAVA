package lojaonline;

public interface CarrinhoOnline {
	
	 public void inserir(Produto p);
	    public void remover(Produto p);
	    public void remover(int codProduto);
	    public String listarConteudo();
	    public double calcularTotal();
	    public void esvaziar();

}
