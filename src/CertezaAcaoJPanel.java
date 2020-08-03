import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CertezaAcaoJPanel extends JOptionPane{
	
	String tituloJanela = "Dino fisio diz:";
	
	
	public CertezaAcaoJPanel(String opcao) {
		
		
		switch (opcao) {
		
		case "voltar":
			Object[] options = { "Confirmar", "Cancelar" };
			showOptionDialog(null, "Deseja mesmo voltar á tela inicial? Todas as informações inseridas no formulario serão perdidas!", tituloJanela, DEFAULT_OPTION, WARNING_MESSAGE, null, options, options[0]);
			setLocation(null);
			setVisible(true);
			break;
		
		case "limparForm":
			Object[] optionsLimpar = { "Confirmar", "Cancelar" };
			showOptionDialog(null, "Deseja mesmo limpar o formulário?", "Dino Fisio diz:", DEFAULT_OPTION, WARNING_MESSAGE, null, optionsLimpar, optionsLimpar[0]);
			setLocation(null);
			setVisible(true);
			break;
			
			
		case "envioVazio":
			showMessageDialog(null,"Preencha todos os campos antes de enviar!");
			setLocation(null);
			setVisible(true);
			break;
			
		}
			
		
	}
	
	private class EventoVoltar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			TelaCadastro cadastro;
//			if (cadastro != null) {
//				
//			}
			
		}
		
		
	}

}
