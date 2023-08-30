package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	private final Color CINZA_ESCURO = new Color(50, 50, 50, 255);
	private final Color CINZA_CLARO = new Color(101, 101, 101, 255);
	private final Color AZUL = new Color(118, 185, 238, 255);

	public Teclado() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

		// Linha 1
		c.gridwidth = 3;
		adicionarBotao("AC", CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("/", CINZA_ESCURO, c, 3, 0);

		// Linha 2
		adicionarBotao("7", CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", CINZA_CLARO, c, 2, 1);
		adicionarBotao("X", CINZA_ESCURO, c, 3, 1);

		// Linha 3
		adicionarBotao("4", CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", CINZA_ESCURO, c, 3, 2);

		// Linha 4
		adicionarBotao("3", CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", CINZA_CLARO, c, 1, 3);
		adicionarBotao("1", CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", CINZA_ESCURO, c, 3, 3);

		// Linha 5
		c.gridwidth = 2;
		adicionarBotao("0", CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao(",", CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", AZUL, c, 3, 4);

	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);

	}
}
