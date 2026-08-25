package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbaGradeAulas extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public AbaGradeAulas(){
		this.setTitle("Grade de Aulas");
	    this.setModal(true);
	    this.setSize(570, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);

	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(200, 200, 200));
		painel.setLayout(null);
		
	    JLabel lbSegunda = new JLabel("Segunda-feira: Musculação");
		lbSegunda.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbSegunda.setBounds(180, 100, 300, 25);
	    lbSegunda.setForeground(Color.BLACK);
	    
	    
	    JLabel lbTerca   = new JLabel("Terça-feira: Arte Marcial");
	    lbTerca.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbTerca.setBounds(180, 120, 300, 25);
	    lbTerca.setForeground(Color.BLACK);
	    
	    
	    JLabel lbQuarta  = new JLabel("Quarta-feira: Musculação");
	    lbQuarta.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbQuarta.setBounds(180, 140, 300, 25);
	    lbQuarta.setForeground(Color.BLACK);
	    
	    
	    JLabel lbQuinta  = new JLabel("Quinta-feira: Pilates");
	    lbQuinta.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbQuinta.setBounds(180, 160, 300, 25);
	    lbQuinta.setForeground(Color.BLACK);
	    
	    
	    JLabel lbSexta   = new JLabel("Sexta-feira: Yoga");
	    lbSexta.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbSexta.setBounds(180, 180, 300, 25);
	    lbSexta.setForeground(Color.BLACK);
	    
	    
	    JLabel lbSabado  = new JLabel("Sábado: Musculação");
	    lbSabado.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbSabado.setBounds(180, 200, 300, 25);
	    lbSabado.setForeground(Color.BLACK);
	    

	    // botões
		JButton btnCriarAula = new JButton("Criar Aula");		
		btnCriarAula.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnCriarAula.setBackground(new Color(210, 0, 58));
		btnCriarAula.setBorder(null);
		btnCriarAula.setForeground(Color.WHITE);
		btnCriarAula.setBounds(120, 330, 300, 25);
		painel.add(btnCriarAula);

		JButton btnAlterarAula = new JButton("Alterar Aula");		
		btnAlterarAula.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnAlterarAula.setBackground(new Color(210, 0, 58));
		btnAlterarAula.setBorder(null);
		btnAlterarAula.setForeground(Color.WHITE);
		btnAlterarAula.setBounds(120, 360, 300, 25);
		painel.add(btnAlterarAula);
		
		JButton btnRemoverAula = new JButton("Remover Aula");		
		btnRemoverAula.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnRemoverAula.setBackground(new Color(210, 0, 58));
		btnRemoverAula.setBorder(null);
		btnRemoverAula.setForeground(Color.WHITE);
		btnRemoverAula.setBounds(120, 390, 300, 25);
		painel.add(btnRemoverAula);
		
	    
	    painel.add(lbSegunda);
	    painel.add(lbTerca);
	    painel.add(lbQuarta);
	    painel.add(lbQuinta);
	    painel.add(lbSexta);
	    painel.add(lbSabado);
	    
	    this.add(painel);
	}

}
