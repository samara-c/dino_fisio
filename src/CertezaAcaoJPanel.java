import javax.swing.JOptionPane;

public class CertezaAcaoJPanel extends JOptionPane{
	
	public CertezaAcaoJPanel(String opcao) {
		
		switch (opcao) {
		
		case "voltar":
			Object[] options = { "Confirmar", "Cancelar" };
			showOptionDialog(null, "Deseja mesmo voltar � tela inicial? Todas as informa��es inseridas no formulario ser�o perdidas!", "Dino Fisio diz:", DEFAULT_OPTION, WARNING_MESSAGE, null, options, options[0]);
			setLocation(null);
			setVisible(true);
			break;
			
		}
			
		
	}
	
	

}
