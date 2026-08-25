package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class AbaPagamentos extends JDialog {

    private static final long serialVersionUID = 1L;

    public AbaPagamentos() {
        this.setTitle("Gerenciar Pagamentos");
        this.setModal(true);
        this.setSize(570, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        JTabbedPane jtabbedpane = new JTabbedPane();
        jtabbedpane.setBounds(0, 0, 570, 500);
        
        JPanel painelPagar = new JPanel();
        painelPagar.setPreferredSize(new Dimension(560, 970));
        painelPagar.setBackground(new Color(200, 200, 200));
        painelPagar.setLayout(null);
        
        JPanel painelAumentar = new JPanel();
        painelAumentar.setPreferredSize(new Dimension(560, 970));
        painelAumentar.setBackground(new Color(200, 200, 200));
        painelAumentar.setLayout(null);

        
        
        
        // aba pagar
        JLabel lbTitulo1 = new JLabel("Pagar Funcionário");
        lbTitulo1.setFont(new Font("Century Gothic", Font.BOLD, 24));
        lbTitulo1.setBounds(160, 20, 300, 30);
        lbTitulo1.setForeground(Color.BLACK);
        painelPagar.add(lbTitulo1);
        
        JLabel lbNomeFuncionario = new JLabel("Nome do Funcionário:");
        lbNomeFuncionario.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        lbNomeFuncionario.setForeground(Color.BLACK);
        lbNomeFuncionario.setBounds(120, 70, 180, 25);
        painelPagar.add(lbNomeFuncionario);

		JTextField txNomeFuncionario = new JTextField();
		txNomeFuncionario.setBounds(120, 100, 280, 25);
		painelPagar.add(txNomeFuncionario);
		
		JButton btnPagar = new JButton("Pagar Funcionário");		
		btnPagar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnPagar.setBackground(new Color(210, 0, 58));
		btnPagar.setBorder(null);
		btnPagar.setForeground(Color.WHITE);
		btnPagar.setBounds(155, 260, 210, 30);
		painelPagar.add(btnPagar);
	    
		btnPagar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionário pago com sucesso");
				setVisible(false);
			}
		});

		
        
        // aba aumentar
        JLabel lbNomeFuncionario2 = new JLabel("Nome do Funcionário:");
        lbNomeFuncionario2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        lbNomeFuncionario2.setForeground(Color.BLACK);
        lbNomeFuncionario2.setBounds(120, 70, 180, 25);
        painelAumentar.add(lbNomeFuncionario2);

		JTextField txNomeFuncionario2 = new JTextField();
		txNomeFuncionario2.setBounds(120, 100, 280, 25);
		painelAumentar.add(txNomeFuncionario2);		
		
        JLabel lbTitulo2 = new JLabel("Aumentar Funcionário");
        lbTitulo2.setFont(new Font("Century Gothic", Font.BOLD, 24));
        lbTitulo2.setBounds(130, 20, 300, 30);
        lbTitulo2.setForeground(Color.BLACK);
        painelAumentar.add(lbTitulo2);

        JLabel lbQtdAumento = new JLabel("Qtd de aumento:");
        lbQtdAumento.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        lbQtdAumento.setForeground(Color.BLACK);
        lbQtdAumento.setBounds(120, 140, 180, 25);
        painelAumentar.add(lbQtdAumento);

	    JComboBox<Object> cbQtdAumento = new JComboBox<>();
	    cbQtdAumento.addItem("10%");
	    cbQtdAumento.addItem("20%");
	    cbQtdAumento.setFont(new Font("Century Gothic", Font.PLAIN, 16));
	    cbQtdAumento.setBounds(120, 170, 280, 30);
	    painelAumentar.add(cbQtdAumento);
	    
        JLabel lbNovoSalario = new JLabel("Novo salário: R$4600.00");
        lbNovoSalario.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        lbNovoSalario.setBounds(170, 220, 300, 30);
        lbNovoSalario.setForeground(Color.BLACK);
        painelAumentar.add(lbNovoSalario);

		JButton btnAumentar = new JButton("Registrar Aumento");		
		btnAumentar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnAumentar.setBackground(new Color(210, 0, 58));
		btnAumentar.setBorder(null);
		btnAumentar.setForeground(Color.WHITE);
		btnAumentar.setBounds(155, 260, 210, 30);
		painelAumentar.add(btnAumentar);
	    
		btnAumentar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aumento registrado com sucesso");
				setVisible(false);
			}
		});

        
		
        jtabbedpane.addTab("Pagar", null, painelPagar);
        jtabbedpane.addTab("Aumentar", null, painelAumentar);

        this.add(jtabbedpane);
    }
}