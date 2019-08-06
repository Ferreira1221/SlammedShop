package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.CarDao;
import org.academiadecodigo.codezillas.persistence.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaCarDao extends GenericJpaDao<Car> implements CarDao {

    public JpaCarDao() {
        super(Car.class);
    }

    public List<Integer> getCarIds() {
        return em.createQuery("select id from Car", Integer.class)
                .getResultList();
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        List<Car> carList = findAll();
        Car car = null;

        for (Car c : carList) {
            if (c.getLicensePlate().equals(licensePlate)) {
                car = c;
            }
        }
        return car;
    }
}
