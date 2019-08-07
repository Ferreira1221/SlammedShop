package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.CarDto;
import org.academiadecodigo.codezillas.persistence.model.Car;
import org.academiadecodigo.codezillas.services.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {

    private CarServiceImpl carService;

    @Autowired
    public CarServiceImpl setCarService() {
        return carService;
    }

    public Car convertCarDtoToCar(CarDto carDto) {

        Car car = (carDto.getId()) != null ? carService.getCarById(carDto.getId()) : new Car();

        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setLicensePlate(carDto.getLicensePlate());
        car.setHorsePower(carDto.getHorsePower());
        car.setCarDate(carDto.getCarDate());

        return car;
    }

    public CarDto convertCarToCarDto(Car car){

        CarDto carDto = new CarDto();

        carDto.setId(car.getId());
        carDto.setBrand(car.getBrand());
        carDto.setModel(car.getModel());
        carDto.setLicensePlate(car.getLicensePlate());
        carDto.setHorsePower(car.getHorsePower());
        carDto.setCarDate(car.getCarDate());

        return carDto;
    }
}
