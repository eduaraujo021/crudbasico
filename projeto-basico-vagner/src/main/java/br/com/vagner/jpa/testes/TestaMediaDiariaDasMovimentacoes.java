package br.com.vagner.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vagner.jpa.modelo.MediaComData;
import br.com.vagner.jpa.modelo.dao.MovimentacaoDao;

public class TestaMediaDiariaDasMovimentacoes {
	public static void main(String[] args) {
		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vagner");
		EntityManager em = emf.createEntityManager();
		
		List<MediaComData> mediaDasMovimentacoes = new MovimentacaoDao(em).getMediaDiariaDasMovimentacoes();
		
		for (MediaComData resultado : mediaDasMovimentacoes) {
			System.out.println("A média das movimentacoes do dia " + resultado.getDia() + "/" + resultado.getMes() + " é: " + resultado.getValor());
		}
	}

}
