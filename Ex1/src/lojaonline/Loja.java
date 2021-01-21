package lojaonline;

public class Loja {

	public static void main(String[] args) {

	        //Produto p1 = new Produto(0, "duh", 0); //ERROU!
	        Smartphone sm1 = new Smartphone(1, "Mi9", 1800, "Xiaomi", "CVD-19", "128GB", "6.39\"");
	        Notebook nb1 = new Notebook(2, "Positivo", 1500.0, "Pouca", "Menos ainda", "Quase nada");
	        CarrinhoOnline cart = new MeuCarrinho();
	        System.out.println(sm1.obterDescricao());
	        System.out.println("");
	        System.out.println(nb1.obterDescricao());
	        System.out.println("----------------------------------");
	        cart.inserir(sm1);
	        cart.inserir(nb1);
	        System.out.println(cart.listarConteudo());
	        System.out.println("Total: R$" + cart.calcularTotal());
	        System.out.println("----------------------------------");
	        cart.remover(nb1);
	        System.out.println(cart.listarConteudo());
	        System.out.println("----------------------------------");
	        cart.remover(1);
	        System.out.println(cart.listarConteudo());
	        
	    

	}

}
