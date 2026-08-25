package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbaMatricula extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public AbaMatricula(){
		this.setTitle("Matrícula");
	    this.setModal(true);
	    this.setSize(570, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);

	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(200, 200, 200));
		painel.setLayout(null);

	    JLabel lbTitulo = new JLabel("Matrícula");
	    lbTitulo.setFont(new Font("Century Gothic", Font.BOLD, 24));
	    lbTitulo.setBounds(220, 30, 300, 25);
	    lbTitulo.setForeground(Color.BLACK);
	    painel.add(lbTitulo);
	    
	    
	    
	    JLabel lbtexto1 = new JLabel("codAluno   nomeAluno                           planoAluno");
	    lbtexto1.setFont(new Font("Century Gothic", Font.BOLD, 16));
	    lbtexto1.setBounds(50, 70, 600, 25);
	    lbtexto1.setForeground(Color.BLACK);
	    painel.add(lbtexto1);
	    
	    JLabel lbtexto2 = new JLabel("ALUNO 1 -- PEDRO PONDIAN NETO -- Solo");
	    lbtexto2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    lbtexto2.setBounds(50, 100, 600, 25);
	    lbtexto2.setForeground(Color.BLACK);
	    painel.add(lbtexto2);
	    
	    JLabel lbtexto3 = new JLabel("ALUNO 2 -- MIGUEL ORNAX                -- Familia");
	    lbtexto3.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    lbtexto3.setBounds(50, 120, 600, 25);
	    lbtexto3.setForeground(Color.BLACK);
	    painel.add(lbtexto3);
	    
	    JLabel lbtexto4 = new JLabel("ALUNO 3 -- DOUGLAS ORNAX            -- Familia");
	    lbtexto4.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    lbtexto4.setBounds(50, 140, 600, 25);
	    lbtexto4.setForeground(Color.BLACK);
	    painel.add(lbtexto4);
	    
	    
		

		this.add(painel);
	}
}
