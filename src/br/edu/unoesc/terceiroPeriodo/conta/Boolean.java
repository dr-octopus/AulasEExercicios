package br.edu.unoesc.terceiroPeriodo.conta;

public class Boolean {
	
	//Com m�todo static, o objeto n�o precisa ser instanciado para ser usado
	public static String traduz(boolean bool) {
		if(bool) {
			return "Sim";
		}
		return "N�o";
	}
	
}
