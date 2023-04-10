package dataAccess.concretes;

import dataAccess.abstracts.CarDao;
import entities.Cars;
import java.util.ArrayList;
import java.util.List;

public class InMemoryCarDao implements CarDao {

    List<Cars> cars = new ArrayList<>();

    @Override
    public void addCar(Cars car) {
        this.cars.add(car);
    }

    @Override
    public void deleteCar(Cars car) {
        cars.remove(car);
    }

    @Override
    public Cars updateCar(int id) {
        return cars.stream().filter(cars -> cars.getCarId() == id)
                .findFirst().orElseThrow();
    }
    @Override
    public List<Cars> getCars() {
        return cars;
    }


}
