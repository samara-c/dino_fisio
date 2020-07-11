

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class Utils {
	
	private String nomeEEnderecoPasta;
	int i =0;
	Desktop desktop = null;
	
	public String data (String format) { //pega a data atual e devolve uma string. precisa receber "dd/MM/yyyy" ou qualquer outro formato de data
		
		Date hoje = new Date();
		SimpleDateFormat hojeSimplificado = new SimpleDateFormat (format);
		String dataFinal = hojeSimplificado.format(hoje);
		
	return dataFinal;	
	
	}
	
	
	public String horario () { //pega o horario atual e devolve uma string
		Date horarioAtual = new Date ();
		SimpleDateFormat horarioSimplificado = new SimpleDateFormat("HH_mm");
		String horarioFinal = horarioSimplificado.format(horarioAtual);
		
		return horarioFinal;
	}
	
	public String criarPasta (String endereco) { //cria uma pasta dentro do diretorio target
		
		try {
			nomeEEnderecoPasta = (endereco+"\\Capturas"+horario());
			File pasta = new File (nomeEEnderecoPasta);
			pasta.mkdir();
			System.out.println("A pasta "+nomeEEnderecoPasta+" foi criada com sucesso!");	
			
		} catch (Exception e) {
			
			System.out.println("Não foi possivel criar a pasta no destino especificado");
			e.printStackTrace();
		}
		return nomeEEnderecoPasta;
		
		
	}
	
	public void capturaScreenshot (String nomeTela) { //captura screenshot da tela e joga dentro da pasta nova criada
		
		 try {
	            
			 	  Robot robot = new Robot();
	            BufferedImage bi=robot.createScreenCapture(pegarDimensaoDaTela());
	            String nomeImagemSalva =  nomeEEnderecoPasta+"/Screencapture_"+nomeTela+"_"+this.i;
	            ImageIO.write(bi, "PNG", new File(nomeImagemSalva));
	            i+=1;
	            
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
	
	}
	
	public Rectangle pegarDimensaoDaTela () { 
		
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					int screenSizeW = (int) toolkit.getScreenSize().getWidth(); 
					int screenSizeH = (int) toolkit.getScreenSize().getHeight();
					Rectangle dimensaoTela = new Rectangle (screenSizeW,screenSizeH);
					
		return dimensaoTela;			
	}
	
	


	public String getNomeEEnderecoPasta() {
		return nomeEEnderecoPasta;
	}


	public void setNomeEEnderecoPasta(String nomeEEnderecoPasta) {
		this.nomeEEnderecoPasta = nomeEEnderecoPasta;
	}
	
	public void testarIntegracaodesktop() {

	if (!Desktop.isDesktopSupported())
		
		throw new IllegalStateException("Desktop resources not supported!");

		desktop = Desktop.getDesktop();   
		//Agora vemos se é possível disparar o browser default.   
		if (!desktop.isSupported(Desktop.Action.BROWSE))   
		    throw new IllegalStateException("No default browser set!");   
		  
	}
	
	public void acessarLink (String link) {
		
		URI uri = null;
		try {
			uri = new URI(link);
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}   
		  	//Dispara o browser default, que pode ser o Explorer, Firefox ou outro.   
		try {
			desktop.browse(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}


