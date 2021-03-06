package br.com.vagner.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vagner.jpa.modelo.Conta;

public class TestandoEstados {
	public static void main(String[] args) {

		// Transient
		Conta conta = new Conta();
		conta.setTitular("Edu");
		conta.setNumero(5050);
		conta.setAgencia(463333);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vagner");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Transient -> Managed
		em.persist(conta);

		// Managed -> Removed
		em.remove(conta);

		em.getTransaction().commit();

	}
}