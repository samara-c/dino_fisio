import java.awt.EventQueue;
import java.awt.TextField;

public class RodarPrograma {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					TelaLogin frame = new TelaLogin();
//					frame.setVisible(true);
//					Conexao conexao = new Conexao();
//					conexao.conecta();
					TelaInicial tela = new TelaInicial();
					tela.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
