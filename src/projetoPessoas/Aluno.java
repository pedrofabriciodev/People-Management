package projetoPessoas;

public class Aluno extends Pessoa{
	private boolean matricula;
	private String curso;
	
	public void cancelarMatricula() {
		this.matricula = false;
	}


//	GETTERS E SETTERS
	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
