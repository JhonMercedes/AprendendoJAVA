
public class Funcionario {

	private String nome;
	private String cpf;
	private String tel;
	private String endereco;
	
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getCpf () {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTel() {
		return tel;
	}
	public void setTel (String tel) {
		this.tel = tel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco (String endereco) { 
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome :"+nome+" CPF : "+cpf+" Telefone : "+tel+" Endereco :"+endereco;
	}
	
	
}