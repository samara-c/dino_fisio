import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial extends JFrame {
	
	public TelaInicial () {
		String imagem = "C:\\Users\\samar\\eclipse-workspace\\CadastroUsuario\\resources\\dino.gif";
		ImageIcon icon = new ImageIcon(imagem);
		JLabel label = new JLabel(icon);
		setSize (600,600);
		add(label);
		setVisible (true);
		
		
	}

	public static void main(String[] args) {
		TelaInicial tela = new TelaInicial();

	}

}
