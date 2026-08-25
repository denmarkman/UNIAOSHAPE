package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AbaFrmAluno extends JDialog {
	
	private static final long serialVersionUID = 1L;

	public AbaFrmAluno() {		
		this.setTitle("Cadastrar Aluno");
	    this.setModal(true);
	    this.setSize(570, 500);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(200, 200, 200));
		painel.setLayout(null);

	    JLabel lbTitulo = new JLabel("Cadastrar Aluno");
	    lbTitulo.setFont(new Font("Century Gothic", Font.BOLD, 24));
	    lbTitulo.setBounds(190, 130, 300, 25);
	    lbTitulo.setForeground(Color.BLACK);
	    painel.add(lbTitulo);
	    
	    
	    
	    JLabel lbUsuario = new JLabel("Nome:");
	    lbUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbUsuario.setBounds(130, 200, 100, 25);
	    lbUsuario.setForeground(Color.BLACK);
	    painel.add(lbUsuario);
		
		JTextField txUsuario = new JTextField();
		txUsuario.setBounds(205, 200, 180, 25);
		painel.add(txUsuario);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lbEmail.setBounds(130, 240, 100, 25);
		lbEmail.setForeground(Color.BLACK);
		painel.add(lbEmail);
		
		JTextField txEmail = new JTextField();
		txEmail.setBounds(205, 240, 180, 25);
		painel.add(txEmail);
		   
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lbSenha.setBounds(130, 280, 100, 25);
		lbSenha.setForeground(Color.BLACK);
		painel.add(lbSenha);
		
		JPasswordField txSenha = new JPasswordField();
		txSenha.setBounds(205, 280, 180, 25);
		painel.add(txSenha);
		
		JLabel lbConfirmSenha = new JLabel("Confirmar Senha:");
		lbConfirmSenha.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lbConfirmSenha.setBounds(40, 320, 300, 25);
		lbConfirmSenha.setForeground(Color.BLACK);
		painel.add(lbConfirmSenha);
		
		JPasswordField txConfirmSenha = new JPasswordField();
		txConfirmSenha.setBounds(205, 320, 180, 25);
		painel.add(txConfirmSenha);

		JRadioButton rbMasculino = new JRadioButton("Masculino");
		JRadioButton rbFeminino = new JRadioButton("Feminino");
		rbMasculino.setFont(new Font("Century Gothic", Font.BOLD, 18));
		rbMasculino.setBackground(new Color(200, 200, 200));
		rbMasculino.setBounds(205, 360, 180, 25);
		rbMasculino.setForeground(Color.BLACK);
		
		rbFeminino.setFont(new Font("Century Gothic", Font.BOLD, 18));
		rbFeminino.setBackground(new Color(200, 200, 200));
		rbFeminino.setBounds(205, 380, 180, 25);
		rbFeminino.setForeground(Color.BLACK);
		
		ButtonGroup grupoGenero = new ButtonGroup();
		grupoGenero.add(rbMasculino);  
		grupoGenero.add(rbFeminino);
		painel.add(rbMasculino);
		painel.add(rbFeminino);
		

		JButton btnCadastrar = new JButton("Cadastrar");		
		btnCadastrar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnCadastrar.setBackground(new Color(210, 0, 58));
		btnCadastrar.setBorder(null);
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBounds(230, 420, 100, 30);
		painel.add(btnCadastrar);
	    
		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
				setVisible(false);
			}
		});
	    
	    this.add(painel);
	}
}
