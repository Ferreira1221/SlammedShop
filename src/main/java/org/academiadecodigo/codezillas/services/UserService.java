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
import java.util.LinkedList;
import java.util.List;

public class UserService implements UserServiceInt{

    private EntityManagerFactory emf;

    public UserService (){
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


        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO Owner").setParameter(owner.getId(), owner);

        em.close();

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
    public Owner findByName(String ownerName) {
        return null;

    }

    @Override
    public Car findByLicensePlate(String licensePlate) {

        EntityManager em = emf.createEntityManager();



        return null;

    }

    @Override
    public List findAllOwners() {

        EntityManager em = emf.createEntityManager();

        List<Owner> allOwners = em.createNativeQuery("SELECT * FROM Owners").getResultList();

        return allOwners;
    }

    @Override
    public List findAllCars(){

        EntityManager em = emf.createEntityManager();

        List<Car> allCars = em.createNativeQuery("SELECT * FROM Cars").getResultList();

        return allCars;
    }

    @Override
    public void countOwners() {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("SELECT COUNT(*) FROM Owner;").getResultList();

        em.close();

    }

    @Override
    public void countInShopCars(){
        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("SELECT COUNT(*) FROM InShop ;").getResultList();

        em.close();


    }







}
