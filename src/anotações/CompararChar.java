package anota��es;

public class CompararChar{
	public static void main(String[] args) {
		String a = "Java", b = "Java";
		if (a == b) //Compara endere�o de mem�ria
		{System.out.println("Mem�ria igual");}
		if (a.equals(b)) //Compara o conte�do das vari�veis
		{System.out.println("String igual");}
	}
}
