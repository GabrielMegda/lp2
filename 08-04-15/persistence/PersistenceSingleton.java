/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

/**
 *
 * @author alunos
 */

public class PersistenceSingleton {

    private static final String PERSISTENCEUNIT = "JavaAplication1PU";

    private static PersistenceSingleton instance;

    private EntityManagerFactory emf;

    private PersistenceSingleton() {

    }

    public static PersistenceSingleton getInstance() {
        if (instance == null) {
            instance = new PersistenceSingleton();
        }

        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCEUNIT);
        }

        return emf;
    }

}
