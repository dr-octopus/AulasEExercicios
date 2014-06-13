package br.edu.unoesc.terceiroPeriodo.heranca;

public enum TipoCliente {
	
	/*Especial, Comum;
	Especial(), Comum(); Mesma coisa que o anterior, por�m, este, serve para o uso par�metros */
	
	Especial(true), Comum(false);
	
	private boolean podeTerEmprestimo;
	
	TipoCliente(boolean podeTerEmprestimo) {
		this.podeTerEmprestimo = podeTerEmprestimo;
	}
		
	public boolean getPodeTerEmprestimo() {
		return podeTerEmprestimo;
	}
	
}
