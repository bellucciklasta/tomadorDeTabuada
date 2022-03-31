package br.com.tabuada.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NovoJogoForm {
	private String nomeDoJogador;
	private String dificuldadeDeJogo;
	private String listaDeTabuadas;
}
