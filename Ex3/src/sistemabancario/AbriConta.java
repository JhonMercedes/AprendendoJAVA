package sistemabancario;

public class AbriConta {

	public static void main(String[] args) {
		
		// C1 e C2 = cliente 1 e cliente 2
		
		ContaBanco c1 = new ContaBanco(2234, "cc", "Jonas"); // cc = Conta Corrente
		ContaBanco c2 = new ContaBanco(2300, "cp", "Janaina"); // cp = Conta Poupança
		
		c1.abriConta();
		c2.abriConta();
		
		c1.depositar(590);
		c2.depositar(900);
		
		c1.sacar(135);
		c2.sacar(50);
		
		c1.fecharConta();
		c1.estadoConta();
		
		c2.estadoConta();
	}

}
