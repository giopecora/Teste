package programaPrincipal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TelaInicial extends JFrame{
	
	public TelaInicial(){
		super("Ualbax");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(520,280);
		setVisible(true);
		
		
		criarMenu();
		criarFormulario();
		
	}
	
	private void criarFormulario(){
		setLayout(new BorderLayout());
		
		JPanel tituloPanel = new JPanel();
		tituloPanel.setLayout(new FlowLayout());
		
		JLabel titulo = new JLabel("Ualbax");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		tituloPanel.add(titulo);
		
		add(tituloPanel, BorderLayout.NORTH);
		
		
		
	}
	
	//CRIA TODOS OS MENUS
	private void criarMenu(){

		//Action Listener
		NovoUsuario novoUsuario = new NovoUsuario();
		
		
		//Cria menu Adicionar
		JMenu menuAdicionar = new JMenu("Adicionar");
		
		JMenuItem criaUsuario = new JMenuItem("Usuário");
		menuAdicionar.addActionListener(novoUsuario);
		menuAdicionar.add(criaUsuario);
		
		JMenuItem criaProduto = new JMenuItem("Produto");
		menuAdicionar.add(criaProduto);
		
		JMenuItem criaFamilia = new JMenuItem("Família");
		menuAdicionar.add(criaFamilia);
		
		//Cria menu Editar
		JMenu menuEditar = new JMenu("Editar");
		
		JMenuItem editaUsuario = new JMenuItem("Usuário");
		menuEditar.add(editaUsuario);
		
		JMenuItem editaProduto = new JMenuItem("Produto");
		menuEditar.add(editaProduto);
		
		
		//Cria menu Buscar
		JMenu menuBuscar = new JMenu ("Buscar");
		
		JMenuItem buscarProduto = new JMenuItem("Buscar Produto");
		menuBuscar.add(buscarProduto);
		
		
		
		//Cria menu Ajuda
		JMenu menuAjuda = new JMenu("Ajuda");
		 
		JMenuItem menuItemSobre = new JMenuItem("Sobre...");
		menuAjuda.add(menuItemSobre);
		
		//Cria a barra para suportar os menus
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		
		barra.add(menuAdicionar);
		barra.add(menuEditar);
		barra.add(menuBuscar);
		barra.add(menuAjuda);
		
	}
	
	private class NovoUsuario implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
				
			
			CadastroUsuario cadastro = new CadastroUsuario();
			
			cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			cadastro.setSize(500,420);
			cadastro.setVisible(true);
			
		}
		
	}
	
}


