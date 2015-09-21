package programaPrincipal;

import javax.swing.JFrame;

public class ProgramaPrincipal {
	public static void main(String[] args) {
	
		/*TelaInicial tela = new TelaInicial();
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(520,280);
		tela.setVisible(true);
		*/
		CadastroUsuario cadastro = new CadastroUsuario();
		
		cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastro.setSize(500,420);
		cadastro.setVisible(true);
	}
}
