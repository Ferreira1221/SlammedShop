package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Car;
import org.academiadecodigo.codezillas.model.Owner;
import org.academiadecodigo.codezillas.model.components.Electronics;
import org.academiadecodigo.codezillas.model.components.Stage;
import org.academiadecodigo.codezillas.model.components.Suspension;
import org.academiadecodigo.codezillas.model.components.Tires;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class UserService implements UserServiceInt {

    private EntityManagerFactory emf;

    public UserService() {
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void addOwner(Owner owner) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO Owner").setParameter(owner.getId(), owner);

        em.close();
    }

    @Override
    public void addCar(Integer ownerId, Car car) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO CarsList").setParameter(car.getLicensePlate(), car);

        //TODO: refactor query, ,missing parameter

        em.close();
    }

    @Override
    public void addTire(Tires tire) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSER INTO Tires").setParameter(tire.getId(), tire);

        em.close();
    }


    @Override
    public void addSuspension(Suspension suspension) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO Suspension").setParameter(suspension.getId(), suspension);

        em.close();
    }

    @Override
    public void addStage(Stage stage) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO Stage").setParameter(stage.getId(), stage);

        em.close();
    }

    @Override
    public void addElectronics(Electronics electronics) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO Electronics").setParameter(electronics.getId(), electronics);

        em.close();
    }

    @Override
    public Owner findByName(String ownerName) {

        EntityManager em = emf.createEntityManager();

        return (Owner) em.createNativeQuery("SELECT * FROM Cars WHERE ownerName = '" + ownerName + "'").getSingleResult();
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {

        EntityManager em = emf.createEntityManager();


        return (Car) em.createNativeQuery("SELECT * FROM Cars WHERE licensePlate = '" + licensePlate + "'").getSingleResult();
    }

    @Override
    public List findAllOwners() {

        EntityManager em = emf.createEntityManager();

        List<Owner> allOwners = em.createNativeQuery("SELECT * FROM Owners").getResultList();


        return allOwners;
    }

    @Override
    public List findAllCars() {

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
    public void countInShopCars() {
        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("SELECT COUNT(*) FROM InShop ;").getResultList();

        em.close();
    }

}

