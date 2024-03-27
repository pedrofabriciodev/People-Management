package projetoPessoas;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	public void fazerAniversario(int i) {
		this.idade += i;
	}
	
	public String detalhes() {
		return "Pessoa [nome=" + getNome() + 
				", sexo=" + getSexo() + 
				", idade=" + getIdade() + "]";
	}

	//	GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
