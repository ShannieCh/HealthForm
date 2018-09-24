package packJava;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DataAccessPatient {

    @PersistenceContext
    private EntityManager em;


    public void addPatient(Patient patient) {
        em.persist(patient);
    }
}
