package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {
	
	private final Color CINZA_ESCURO = new Color(50, 50, 50, 255);
	private final Color CINZA_CLARO = new Color(101, 101, 101, 255);
	private final Color AZUL = new Color(118, 185, 238, 255);

	public Teclado() {
		setLayout(new GridLayout(5, 4));
		
		add(new Botao("AC", CINZA_ESCURO));
		add(new Botao("+/-", CINZA_ESCURO));
		add(new Botao("%", CINZA_ESCURO));
		add(new Botao("/", AZUL));
		
		add(new Botao("7", CINZA_CLARO));
		add(new Botao("8", CINZA_CLARO));
		add(new Botao("9", CINZA_CLARO));
		add(new Botao("X", AZUL));
		
		add(new Botao("7", CINZA_CLARO));
		add(new Botao("8", CINZA_CLARO));
		add(new Botao("9", CINZA_CLARO));
		add(new Botao("X", AZUL));
		
		add(new Botao("7", CINZA_CLARO));
		add(new Botao("8", CINZA_CLARO));
		add(new Botao("9", CINZA_CLARO));
		add(new Botao("X", AZUL));
		
		add(new Botao("7", CINZA_CLARO));
		add(new Botao("8", CINZA_CLARO));
		add(new Botao("9", CINZA_CLARO));
		add(new Botao("X", AZUL));
	}
}
