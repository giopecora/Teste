package programaPrincipal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroUsuario extends JFrame {
	
	public CadastroUsuario(){
		super("Cadastro de Usuário");
	}
	
	private void criarFormulario(){
		setLayout(new BorderLayout());
		
		JPanel tituloPanel = new JPanel(new FlowLayout());
		
		JLabel titulo = new JLabel("Cadastro de Usuário");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		tituloPanel.add(titulo);
		
		JPanel cadastroPanel = new JPanel(new FlowLayout());
		
		JLabel nomeLabel = new JLabel("Nome");
		JTextField nomeField = new JTextField(40);
		
		JLabel senhaLabel = new JLabel("Senha");
		JTextField senhaField = new JPasswordField(40);
		
		cadastroPanel.add(nomeLabel, nomeField);
		cadastroPanel.add(senhaLabel, senhaField);
		
		
		JPanel botoesPanel = new JPanel(new FlowLayout());
		
		JButton botaoSalvar = new JButton("Salvar");
		JButton botaoFechar = new JButton("Fechar");
		
		botoesPanel.add(botaoSalvar);
		botoesPanel.add(botaoFechar);
		
		add(tituloPanel, BorderLayout.NORTH);
		add(cadastroPanel, BorderLayout.CENTER);
		add(botoesPanel, BorderLayout.SOUTH);
		
		
	}
	
	
}
