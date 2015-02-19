package es.open4job.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.open4job.jpa.entity.AlumnoMatriculaEntity;

public class EjecutaJPA {

	public static void main(String[] args) {

		AlumnoMatriculaEntity alumnoMatricula = new AlumnoMatriculaEntity(2, 1,
				2013, 4, 5, "informatica", 1);
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(alumnoMatricula);
			AlumnoMatriculaEntity a = new AlumnoMatriculaEntity();
			a.setId(9);
			em.remove(alumnoMatricula);
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();

		}

	}
}
