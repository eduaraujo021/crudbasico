package br.com.vagner.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarTabelaConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vagner");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();

	}
}