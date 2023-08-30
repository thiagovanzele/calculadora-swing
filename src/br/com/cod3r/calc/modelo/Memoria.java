package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private enum TipoComando {
		ZERAR, NUMERO, DIVISAO, MULTIPLICACAO, SOMA, SUBTRACAO, IGUAL, VIRGULA;
	};

	private static Memoria instancia = new Memoria();

	private String textoAtual = "";

	private final List<MemoriaObservador> observadores = new ArrayList<>();

	private Memoria() {
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void processarComando(String texto) {

		TipoComando tipoComando = detectarTipoComando(texto);
		System.out.println(tipoComando);

		if (texto.equals("AC")) {
			textoAtual = "";
		} else {
			textoAtual += texto;
		}

		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private TipoComando detectarTipoComando(String texto) {
		if (textoAtual.isEmpty() && texto == "0") {
			return null;
		}

		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			if (texto.equals("AC")) {
				return TipoComando.ZERAR;
			} else if (texto.equals("/")) {
				return TipoComando.DIVISAO;
			} else if (texto.equals("+")) {
				return TipoComando.SOMA;
			} else if (texto.equals("-")) {
				return TipoComando.SUBTRACAO;
			} else if (texto.equals("=")) {
				return TipoComando.IGUAL;
			} else if (texto.equals("x")) {
				return TipoComando.MULTIPLICACAO;
			}
		}
		return null;
	}
		
}
