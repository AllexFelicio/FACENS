
package br.com.value.projects.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.value.projects.dominio.*;

public class AtddTeste {
	@Test
	public void deveEncontradoCursoMatriculado() {
		Integer idCurso = 1;
		Curso cursos = Curso.findById(idCurso).orElse(null);
		
		assertEquals(true, cursos != null);
	}
	@Test
	public void deveAvaliarCartãoInvalidoParaPagamento() {
		Cartao cartao = new Cartao("cartão invalido");
		
		assertEquals(false,Cartao.validar(cartao));
	}
	@Test
	public void deveAvaliarCriptomoedaInvalidoParaPagamento() {
		Criptomoeda criptomoeda = new Criptomoeda("Criptomoeda invalida"); 
		assertEquals(false,Criptomoeda.validar(criptomoeda));
	}
	@Test
	public void deveAvaliarPixInvalidoParaPagamento() {
		Pix pix = new Pix("Pix invalido");
		assertEquals(false, Pix.validar(pix));
	}
	@Test
	public void DistribuirCurso() {
		Integer idPagamento = 1;
		Pagamento pagamento = Pagamento.findById(idPagamento).orElse(null);

		assertEquals(true, pagamento != null);
	}
	@Test
	public void validaPagamentoBoleto() {
		Integer idBoleto = 1;
		Pagamento pagBoleto = Pagamento.findById(idBoleto).orElse(null);

		assertEquals(true, pagBoleto != null);
	}	
}
