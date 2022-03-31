package br.com.tabuada.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tabuada.dtos.NovoJogoForm;

@RestController
@RequestMapping("/tabuada")
public class TomadorDeTabuada {

	@PutMapping
	public List<String> lista(@RequestBody NovoJogoForm novoJogoForm) {

		
//		if (tomadorDeTabuada == null) {
//			List<Resposta> resposta = (respostaRepository).findAll();
//			return (respostaRepository).converter(resposta);
//			}
		return null;
	}

	@PostMapping
	public void cadastrar(@RequestBody NovoJogoForm resposta) {
		
	}
	
	
	
	
	
	
//	mySQL instalar, criar usuario, tabela de test, 
//	mongo db
//	@RequestBody(payLoad)

//	1-O usuario pode selecionar ./
//	criar projeto novo(chamado tomador de tabuada)./
//	criar um controller de jogo(jogoController)./
//	criar no postman request que envia um payload com configurações do jogo.
	
//	criar no controller um end point que recebe o payload, e salva o inicio do jogo no banco e responde com um payload contendo a proxima tabuada tomada.
//	As tabuadas devem ser inseridas todas em uma lista e embaralhadas aleatoriamente.
//	criar no postman um request que envia um payload com a resposta do usuario.
//	criar um end point que recebe a resposta do usuario(payload), validando a resposta e respondendo certo ou errado.
//	Quando errado a resposta, deve armazenar no banco a tabuada errada, com a resposta dada e qual seria a correta.
//	além disso, deve inserir na lista de tabuadas duas vezes a resposta errada.
}
