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
		JButton botaoIniciar = new JButton("Novo cadastro");
		JButton botaoBusca = new JButton ("Buscar paciente");
		botaoIniciar.addActionListener(this);
		
		setTitle("Bem vindo ao DinoFisio!");
		setSize (600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(label);
		add(botaoIniciar);
		add(botaoBusca);
				
		
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
