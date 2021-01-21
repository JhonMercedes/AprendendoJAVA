package exerc1;

public class Caneta {
	
		public String modelo;
	    public String cor;
	    private float ponta;
	    protected int carga; 
	    protected boolean tampada;
	    
	    void status(){
	        System.out.println("Modelo: " + this.modelo);
	        System.out.println("Cor: " + this.cor);
	        System.out.println("Ponta: " + this.ponta);
	        System.out.println("Carga: " + this.carga);
	        System.out.println("Esta tampada? " + this.tampada);
	    }
	    void rabiscar(){
	        if(this.tampada==true){
	            System.out.println("Não esta rabiscando!");
	        }else{
	            System.out.println("Rabiscando...");
	            this.carga--;
	        }
	    }
	    void tampar(){
	        if(this.tampada==true){
	            System.out.println("Caneta já está tampada!");
	        }else{
	            this.tampada = true;
	            System.out.println("Caneta foi tampada com sucesso!");
	        }
	    }
}
