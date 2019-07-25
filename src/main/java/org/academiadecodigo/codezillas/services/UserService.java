package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Car;
import org.academiadecodigo.codezillas.model.Owner;
import org.academiadecodigo.codezillas.model.components.Electronics;
import org.academiadecodigo.codezillas.model.components.Stage;
import org.academiadecodigo.codezillas.model.components.Suspension;
import org.academiadecodigo.codezillas.model.components.Tires;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;

public class UserService implements UserServiceInt{

    private Connection connection;
    private EntityManagerFactory emf;

    public UserService (Connection connection){
        this.connection = connection;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }

    @Override
    public void addOwner(Owner owner) {

    }

    @Override
    public void addCar(Car car) {

    }

    @Override
    public void addTire(Tires tire) {

    }

    @Override
    public void addSuspension(Suspension suspension) {

    }

    @Override
    public void addStage(Stage stage) {

    }

    @Override
    public void addElectronics(Electronics electronics) {

    }

    @Override
    public void findByName(String ownerName) {

    }

    @Override
    public void findByLicensePlate(String licensePlate) {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void count() {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("SELECT COUNT(*) FROM owner;").getResultList();

        em.close();

    }



}
