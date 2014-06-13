package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ExemploSwing extends JFrame implements ActionListener{ //A classe herda tudo do JFrame - O implements ActionListener, implementa o respectivo pacote (para a��es do bot�o) 
	
	//Componentes da tela -> Se declarado em cima, ficar� global, mas este � privado da classe
	private JLabel jlbNome; //Nome padronizado de labels, iniciando com jlb
	private JTextField jtfNome;
	private JButton jbtOk;
	
	// Construtor da Classe
	// Construtor -> primeira a��o a ser executada
	// Construtor define o "layout", telas, bot�es, etc.
	// 1� Sempre possui o mesmo nome do que a Classe
	ExemploSwing(){
		
		setLayout(null);
		
		// Criando o Label
		jlbNome = new JLabel();
		jlbNome.setText("Nome: "); //Atribui String ao Label
		jlbNome.setBounds(10, 5, 100, 50); // X, Y, Largura, Altura
		getContentPane().add(jlbNome); // Adiciona o Label ao painel
		
		// Criando o Text Field
		jtfNome = new JTextField();
		jtfNome.setBounds(50, 22, 200, 20);
		getContentPane().add(jtfNome);
		
		// Criando o bot�o
		jbtOk = new JButton();
		jbtOk.setText("OK");
		jbtOk.setBounds(270, 22, 60, 19);
		jbtOk.addActionListener(this);
		getContentPane().add(jbtOk);
		
		// Criando o Construtor
		setTitle("Tela 01");
		setSize(360,100); // Largura, Altura
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se n�o for feito, o programa continuar� rodando e consumindo mem�ria, mesmo quando a janela for fechada
	}
	public static void main(String[] args) {
		ExemploSwing tela01 = new ExemploSwing();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "Instalando V�rus...");
		JOptionPane.showMessageDialog(this, "V�rus Instalado com Sucesso!");
	}
}
