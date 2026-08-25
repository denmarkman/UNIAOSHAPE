package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbaAssinatura extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public AbaAssinatura(){
		this.setTitle("Assinatura");
	    this.setModal(true);
	    this.setSize(570, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);

	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(200, 200, 200));
		painel.setLayout(null);

	    JLabel lbTitulo = new JLabel("Assinatura");
	    lbTitulo.setFont(new Font("Century Gothic", Font.BOLD, 24));
	    lbTitulo.setBounds(220, 30, 300, 25);
	    lbTitulo.setForeground(Color.BLACK);
	    painel.add(lbTitulo);
		
	    JLabel lbTituloPlano1 = new JLabel("Plano Solo");
	    lbTituloPlano1.setFont(new Font("Century Gothic", Font.BOLD, 20));
	    lbTituloPlano1.setBounds(60, 90, 300, 25);
	    lbTituloPlano1.setForeground(Color.BLACK);
	    painel.add(lbTituloPlano1);
	    
	    JLabel lbBeneficio1Plano1 = new JLabel("Personal Trainer");
	    lbBeneficio1Plano1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    lbBeneficio1Plano1.setBounds(50, 110, 300, 25);
	    lbBeneficio1Plano1.setForeground(Color.BLACK);
	    painel.add(lbBeneficio1Plano1);
	    
	    JLabel lbPrecoPlano1 = new JLabel("R$80,00");
	    lbPrecoPlano1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	    lbPrecoPlano1.setBounds(75, 150, 300, 25);
	    lbPrecoPlano1.setForeground(new Color(210, 0, 58));
	    painel.add(lbPrecoPlano1);
	    
	    
	    
	    
	    JLabel lbTituloPlano2 = new JLabel("Plano Família");
	    lbTituloPlano2.setFont(new Font("Century Gothic", Font.BOLD, 20));
	    lbTituloPlano2.setBounds(360, 90, 300, 25);
	    lbTituloPlano2.setForeground(Color.BLACK);
	    painel.add(lbTituloPlano2);
	    
	    JLabel lbBeneficioPlano2 = new JLabel("Tudo do Plano Anterior");
	    lbBeneficioPlano2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    lbBeneficioPlano2.setBounds(340, 110, 300, 25);
	    lbBeneficioPlano2.setForeground(Color.BLACK);
	    painel.add(lbBeneficioPlano2);
	    
	    JLabel lbPrecoPlano2 = new JLabel("R$75,00");
	    lbPrecoPlano2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	    lbPrecoPlano2.setBounds(390, 150, 300, 25);
	    lbPrecoPlano2.setForeground(new Color(210, 0, 58));
	    painel.add(lbPrecoPlano2);
	    
	    
	    

		this.add(painel);
	}
}
