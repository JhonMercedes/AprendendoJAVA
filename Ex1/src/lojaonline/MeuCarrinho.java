package lojaonline;

import java.util.LinkedList;
import java.util.List;

public class MeuCarrinho implements CarrinhoOnline {
	
	private List<Produto> listaProdutos;
	
	public MeuCarrinho() {
        listaProdutos = new LinkedList<>();
    }

	@Override
	public void inserir(Produto p) {
		listaProdutos.add(p);
	}

	@Override
	public void remover(Produto p) {
		listaProdutos.remove(p);
		
	}

	@Override
	public void remover(int codProduto) {
	
		for (Produto p : listaProdutos) {
			if (p.getCodigo() == codProduto) {
				listaProdutos.remove(p);
        	}
		}
	}

	@Override
	public String listarConteudo() {
		 String conteudo = "Seus Produtos:\n";
	        for (Produto p : listaProdutos) {
	            conteudo += p.getNome() + "\tR$" + p.getValor();
	        }
	        return conteudo;
	}

	@Override
	public double calcularTotal() {
		double total = 0.0;
        for (Produto p : listaProdutos) {
            total += p.getValor();
        }
        return total;
	}

	@Override
	public void esvaziar() {
		listaProdutos.clear();
	}
	

}
