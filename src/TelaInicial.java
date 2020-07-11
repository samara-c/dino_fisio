import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial extends JFrame implements ActionListener {
	
	public TelaInicial () {
		String imagem = "C:\\Users\\samar\\Documents\\ResourcesProg\\dino.gif";
		ImageIcon icon = new ImageIcon(imagem);
		
		
		JLabel label = new JLabel(icon);
		JLabel labelTexto = new JLabel("Bem vindo ao Dino Fisio!");
		JButton botaoBusca = new JButton ("Buscar paciente");
		JButton botaoIniciar = new JButton("Novo cadastro");
		JButton botao3 = new JButton("Botao 3");
		JButton botao4 = new JButton ("Botao 4");
		label.setBounds(40,90,300,300);
		labelTexto.setBounds(120,250,200,200);
		botaoIniciar.setBounds(350,150,150,30);
		botaoBusca.setBounds(350,190,150,30);
		botao3.setBounds(350,230,150,30);
		botao4.setBounds(350,270,150,30);
		
		
		botaoIniciar.addActionListener(this);
		
		setTitle("Dino Fisio - 0.1");
		setSize (600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		add(label);
		add(botaoIniciar);
		add(botaoBusca);
		add(labelTexto);
		add(botao3);
		add(botao4);
		
				
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		TelaCadastro tela = new TelaCadastro();
		tela.setVisible(true);
	
		
	}
	
	private class Cadastro implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
				
				new TelaCadastro().setVisible(true);
				
				
				
				
			}
			catch (Exception ex) {
				ex.printStackTrace();
				
				
			}
			
			
		}
		
		
		
	}

	

}
