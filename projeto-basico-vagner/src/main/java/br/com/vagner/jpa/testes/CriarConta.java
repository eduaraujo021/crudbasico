package br.com.vagner.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vagner.jpa.modelo.Conta;

public class CriarConta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vagner");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Jubileu");
		conta.setNumero(1116);
		conta.setAgencia(1015);
		conta.setSaldo(400.0);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		
		
	}
}
