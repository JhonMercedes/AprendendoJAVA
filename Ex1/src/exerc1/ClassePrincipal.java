package exerc1;

public class ClassePrincipal {
	
	

	    public static void main(String[] args) {
	        
	       Caneta c1 = new Caneta(); 
	       c1.status(); 

	       c1.modelo = "BIC trasparente";
	       c1.cor = "Azul";
	       c1.carga = 100;
	       c1.tampada = false; 
	/*
	       Repare que tampada é protected em Caneta.java, logo, só é possível alterar aqui
	       porque o atributo tampada esta sendo chamado dentro da classe a qual ele pertence ou/e é filho.
	*/
	       
	       c1.status(); 
	       c1.rabiscar(); 
	       c1.tampar(); 
	       c1.status();
	       //c1.ponta = 0.5; //Impossível pois ponta é private.
	    }
	    
}

