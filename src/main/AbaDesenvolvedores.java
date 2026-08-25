package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbaDesenvolvedores extends JDialog {
	
	private ImageIcon iconeImgPedro;
	private Image imgPedroRedim;
	private String localImgPedro = "images/pedro.png";
	
	private ImageIcon iconeImgGustavo;
	private Image imgGustavoRedim;
	private String localImgGustavo = "images/gus.png";
	
	private ImageIcon iconeImgMiguel;
	private Image imgMiguelRedim;
	private String localImgMiguel = "images/mig.png";
	
	private ImageIcon iconeImgGuilas;
	private Image imgGuilasRedim;
	private String localImgGuilas = "images/guilas.png";
	
	private static final long serialVersionUID = 1L;

	public AbaDesenvolvedores() {		
		this.setTitle("Quem Somos");
	    this.setModal(true);
	    this.setSize(570, 500);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(200, 200, 200));
		painel.setLayout(null);
        
        
        // pedro
        iconeImgPedro = new ImageIcon(localImgPedro);
        imgPedroRedim = iconeImgPedro.getImage().getScaledInstance(78, 90, Image.SCALE_SMOOTH);
        iconeImgPedro = new ImageIcon(imgPedroRedim);
        JLabel lbImgPedro = new JLabel();
        lbImgPedro.setIcon(iconeImgPedro);
        lbImgPedro.setBounds(45, 0, 150, 150);
        
        JLabel lbTextoPedro = new JLabel("Pedro Pondian");
        lbTextoPedro.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lbTextoPedro.setBounds(140, 25, 500, 30);
        lbTextoPedro.setForeground(Color.BLACK);
        painel.add(lbTextoPedro);
        
        JLabel lbDescPedro = new JLabel("Desenvolvedor");
        lbDescPedro.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        lbDescPedro.setBounds(140, 45, 500, 30);
        lbDescPedro.setForeground(Color.BLACK);
        painel.add(lbDescPedro);
        
        
        
        // gustavo
        iconeImgGustavo = new ImageIcon(localImgGustavo);
        imgGustavoRedim = iconeImgGustavo.getImage().getScaledInstance(78, 90, Image.SCALE_SMOOTH);
        iconeImgGustavo = new ImageIcon(imgGustavoRedim);
        JLabel lbImgGustavo = new JLabel();
        lbImgGustavo.setIcon(iconeImgGustavo);
        lbImgGustavo.setBounds(45, 100, 150, 150);
        
        JLabel lbTextoGustavo = new JLabel("Gustavo Severo");
        lbTextoGustavo.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lbTextoGustavo.setBounds(140, 125, 500, 30);
        lbTextoGustavo.setForeground(Color.BLACK);
        painel.add(lbTextoGustavo);
        
        JLabel lbDescGustavo = new JLabel("Desenvolvedor");
        lbDescGustavo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        lbDescGustavo.setBounds(140, 145, 500, 30);
        lbDescGustavo.setForeground(Color.BLACK);
        painel.add(lbDescGustavo);
        
        
        // miguel
        iconeImgMiguel = new ImageIcon(localImgMiguel);
        imgMiguelRedim = iconeImgMiguel.getImage().getScaledInstance(78, 90, Image.SCALE_SMOOTH);
        iconeImgMiguel = new ImageIcon(imgMiguelRedim);
        JLabel lbImgMiguel = new JLabel();
        lbImgMiguel.setIcon(iconeImgMiguel);
        lbImgMiguel.setBounds(45, 200, 150, 150);
        
        JLabel lbTextoMiguel = new JLabel("Miguel Ornax");
        lbTextoMiguel.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lbTextoMiguel.setBounds(140, 225, 500, 30);
        lbTextoMiguel.setForeground(Color.BLACK);
        painel.add(lbTextoMiguel);
        
        JLabel lbDescMiguel = new JLabel("Desenvolvedor");
        lbDescMiguel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        lbDescMiguel.setBounds(140, 245, 500, 30);
        lbDescMiguel.setForeground(Color.BLACK);
        painel.add(lbDescMiguel);
        
        
        // guilherme
        iconeImgGuilas = new ImageIcon(localImgGuilas);
        imgGuilasRedim = iconeImgGuilas.getImage().getScaledInstance(78, 90, Image.SCALE_SMOOTH);
        iconeImgGuilas = new ImageIcon(imgGuilasRedim);
        JLabel lbImgGuilas = new JLabel();
        lbImgGuilas.setIcon(iconeImgGuilas);
        lbImgGuilas.setBounds(45, 300, 150, 150);
        
        JLabel lbTextoGuilas = new JLabel("Guilherme Rocha");
        lbTextoGuilas.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lbTextoGuilas.setBounds(140, 325, 500, 30);
        lbTextoGuilas.setForeground(Color.BLACK);
        painel.add(lbTextoGuilas);
        
        JLabel lbDescGuilas = new JLabel("Desenvolvedor");
        lbDescGuilas.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        lbDescGuilas.setBounds(140, 345, 500, 30);
        lbDescGuilas.setForeground(Color.BLACK);
        painel.add(lbDescGuilas);
        
        
        
	    painel.add(lbImgPedro);
	    painel.add(lbImgGustavo);
	    painel.add(lbImgMiguel);
	    painel.add(lbImgGuilas);
	    this.add(painel);
	}
}