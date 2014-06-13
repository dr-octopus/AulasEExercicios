package br.edu.unoesc.terceiroPeriodo.conta;

public class MainDepartamento {
	public static void main(String[] args) {
		
		Departamento dpto = new Departamento("TI", 30.0);
		Cargo cargo = new Cargo("Desenvolvedor", 1000.0);
		Cargo cargo2 = new Cargo("Desenvolvedor Web", 900.0);
		Funcionario funcionario = new Funcionario("Luiz", 9999.99, dpto, cargo);
		Funcionario funcionario2 = new Funcionario("Azucrinaldo", 2344.11, dpto, cargo2);
		
		System.out.println("Sal�rio do "+ funcionario.getNome() +": "+ funcionario.getSalarioBruto().floatValue());		
		System.out.println("Sal�rio do "+ funcionario2.getNome() +": "+ funcionario2.getSalarioBruto().floatValue());
		
		if (funcionario.isSalarioInferiorAoMinimo()) {
			System.out.println("Sal�rio � menor do que o m�nimo do cargo.");
		} else {
			System.out.println("Sal�rio n�o � menor do que o m�nimo do cargo.");
		}
		
		System.out.println(Boolean.traduz(funcionario.isSalarioInferiorAoMinimo()));
		
	}
}
