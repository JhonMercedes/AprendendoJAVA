package sistemabancario;

public class ContaBanco {
	
	//Atributos 
	
	public int numConta;
	protected String tipoConta;
	private String nomeConta;
	private float saldoConta;
	private boolean statusConta;
	
	//Métodos especiais Construtor
	
	public ContaBanco (int numConta, String tipoConta, String nomeConta) {
		//Valores sendo recebidos
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.nomeConta = nomeConta;
		//Valores pré-definidos 
		this.statusConta = false; 
	}

	//Getters e Setters 
	public int getNumConta() {return numConta;}

	public void setNumConta(int numConta) {this.numConta = numConta;}

	public String getTipoConta() {return tipoConta;}

	public void setTipoConta(String tipoConta) {this.tipoConta = tipoConta;}

	public String getNomeConta() {return nomeConta;}

	public void setNomeConta(String nomeConta) {this.nomeConta = nomeConta;}

	public float getSaldoConta() {return saldoConta;}

	public void setSaldoConta(float saldoConta) {this.saldoConta = saldoConta;}

	public boolean isStatusConta() {return statusConta;}

	public void setStatusConta(boolean statusConta) {this.statusConta = statusConta;}
	
	/* Métodos personalizados
	- Abrir conta / status == false / tipo de conta "cc" conta corrente "cp" conta poupança  
	*/
	public void abriConta() {
		if (this.tipoConta == "cc" && this.statusConta == false) { // status false ou seja não possiu conta 
			this.saldoConta += 50; //Bonus de conta corrente 
			this.statusConta = true; // True, agora possui uma conta
			System.out.println("Abertura de conta realizada com sucesso!!");
		} else {
			System.out.println("Cliente já possui uma conta em aberto do tipo "+ this.tipoConta);
		}
	}
	public void fecharConta() {
		if (this.statusConta == true && this.saldoConta == 0) { // true possui conta, saldo = 0, caso contrario retirar dinheiro em conta 
			this.statusConta = false;
			System.out.println("Conta encerrado com sucesso!!");
		} else if (this.saldoConta > 0) {
			System.out.println("ERRO! Você possui saldo na sua conta. Retire seus fundos. Total: " +this.saldoConta);
		} else {
			System.out.println("Não há conta para ser encerrada!");
		}
	}
	public void depositar(float vDeposito) { // Recebendo parametro deposito do tipo float
		if (this.statusConta == true && vDeposito >= 1) {
			this.saldoConta += vDeposito;
			System.out.println("Deposito no valor de: "+vDeposito+ "realizado com sucesso! Saldo atual: "+this.saldoConta);
		}else {
			System.out.println("ERRO! Conta não encontrado e/ou valor de deposito incorreto. ");
		}
	}
	public void sacar(float vSaque) { // Recebendo parametro saque do tipo float
		if (this.statusConta == true && vSaque >= 1 && vSaque <= this.saldoConta) { // Possuir conta e valor do saque for maior que 1 
			this.saldoConta -= vSaque;
			System.out.println("Saque de "+ vSaque + "realizado com sucesso! Saldo atual: "+this.saldoConta);
		}else {
			System.out.println("ERRO! Valor de saque inválido. Seu saldo atual é: "+this.saldoConta);
		}
	}
	
	public void tarifasMensal() {
		
		int vTarifa = 0; // valor ad tarifa 
		
		if (this.tipoConta == "cc" ) {
			vTarifa = 12;
			
		}else if (this.tipoConta == "cp") {
			vTarifa = 22;
		} 
		
		//Atualizando saldo em conta
		
		if (this.statusConta == true && this.saldoConta >= vTarifa) {
			if (this.tipoConta == "cp") {
				this.saldoConta -= vTarifa;
				
			}else if (this.tipoConta == "cc") {
				this.saldoConta -= vTarifa;
				
			}
		}else { 
			System.out.println(this.nomeConta +" sua não possui saldo suficiente para realizar o desconto da Tarifa MENSAL, efetue um deposito");
		}
	}
	
	public void estadoConta() {
		System.out.println("----------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Nome: " + this.getNomeConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.getSaldoConta());
	}
	
}
