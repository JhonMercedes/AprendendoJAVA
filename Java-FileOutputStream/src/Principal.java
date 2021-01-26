import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	
	static ArrayList<Funcionario> listarCliente = new ArrayList<Funcionario>();
	
	
	public static void main(String args[] ) {
		Scanner leia = new Scanner(System.in);
		int opMenu = -1;
		Funcionario cliente = null;
		
		try {
			FileOutputStream clientes = new FileOutputStream("funcionario.txt");
			PrintWriter pr = new PrintWriter(clientes);
			pr.println(cliente);
			pr.close();
			clientes.close();
		}catch (Exception e) {
			System.out.println("Erro ao criar o arquivo");
		}
		
		do {
			System.out.println("----------------------------");
			System.out.print("Digite a opçãoo: ");
			System.out.println("[0] - Sair do Programa");
			System.out.println("[1] - Cadastrar Funcionario");
			System.out.println("[2] - Imprimir Lista de Funcionario");
			System.out.println("[3] - Excluir Cadastro Funcionario");
			System.out.println("[4] - Aterar Dados Funcionario");
			opMenu = leia.nextInt();
			System.out.println("----------------------------");
	
		if (opMenu == 1) {
			System.out.println("###### CADASTRO FUNCIONARIO ######");
			cliente = new Funcionario();
			System.out.println("Informe o Nome :");
			cliente.setNome(leia.next());
			System.out.println("Informe o CPF:");
			cliente.setCpf(leia.next());
			System.out.println("Informe o Telefone :");
			cliente.setTel(leia.next());
			System.out.println("Informe o Endereço :");
			cliente.setEndereco(leia.next());
			listarCliente.add(cliente);
			
			
			
		}
		if(opMenu ==2 ) {
			System.out.println("###### LISTA DE CADASTRADOS ######");
			for(int i = 0; i <listarCliente.size(); i++) {
				System.out.println(listarCliente.get(i));
			}
		}
		if (opMenu == 3) {
			int i;
			System.out.println("###### EXCLUIR CADASTRO #####");
			listarCliente.size();
			for( i=0; i<listarCliente.size(); i++) {
				System.out.printf("Posição %d- %s\n", i, listarCliente.get(i));
			}
			
			System.out.println("Informe a a posição a ser Excluida :");
			i = leia.nextInt();
			try {
				listarCliente.remove(i);
				
			}catch(IndexOutOfBoundsException e) {
				System.out.printf("\nErro: Posição invalida",e.getMessage());
			}
		}	
		if(opMenu ==4) {
			System.out.println("###### Alterar Cadastro #####");
			int i;
			String novoCliente;
			listarCliente.size();
			for(i=0; i <listarCliente.size(); i++) {
				System.out.printf("Posiçãoo %d- %s\n", i,listarCliente.get(i));
			}
			System.out.println("Informe qual cliente quer alterar :");
			i = leia.nextInt();
			
			System.out.println("-------- Atualizar Cadastro ---------");
			cliente = new Funcionario();
			System.out.println("Informe o Nome :");
			cliente.setNome(leia.next());
			System.out.println("Informe o CPF:");
			cliente.setCpf(leia.next());
			System.out.println("Informe o Telefone :");
			cliente.setTel(leia.next());
			System.out.println("Informe o Endereço :");
			cliente.setEndereco(leia.next());
			listarCliente.set(i, cliente);
			
		}
		
			
		
	}
		while (opMenu !=0);

}
}