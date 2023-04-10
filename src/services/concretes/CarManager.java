package services.concretes;

import dataAccess.abstracts.CarDao;
import entities.Cars;
import services.abstracts.CarService;
import java.util.List;

public class CarManager implements CarService {

    private final CarDao carDao;

    public CarManager(CarDao carDao){
        this.carDao = carDao;
    }

    @Override
    public void addCar(Cars car) {
        if (car.getBrand().isEmpty()) {
            System.out.println("Araba Markası Boş Olamaz!");
        } else {
            carDao.addCar(car);
        }
    }

    @Override
    public void deleteCar(Cars cars) {
        carDao.deleteCar(cars);
    }

    @Override
    public Cars updateCar(int id) {

        return carDao.updateCar(id);
    }

    @Override
    public List<Cars> getCars() {
        return carDao.getCars();
    }
}
