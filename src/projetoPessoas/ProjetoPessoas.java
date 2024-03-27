package projetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// programa principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Cláudio");
		p2.setNome("Maria");
		p3.setNome("Fabiana");
		p4.setNome("Pedro");
		
		p2.setCurso("Analise e Desenvolvimento de Sistemas");
		p3.setEspecialidade("Banco de Dados");
		p4.setSetor("Programador Java Back-ends");
		
		p4.setSexo("Masculino");
		p1.setSexo("Masculino");
		p2.setSexo("Feminino");
		p3.setSexo("Feminino");
		
		p1.setIdade(30);
		p2.setIdade(15);
		p3.setIdade(25);
		p4.setIdade(19);
		
		
		
		System.out.println(p1.detalhes());
		System.out.println(p2.detalhes());
		System.out.println(p3.detalhes());
		System.out.println(p4.detalhes());
		

	}

}
