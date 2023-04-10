package services.abstracts;

import entities.Cars;
import java.util.List;

public interface CarService {

    void addCar(Cars cars);
    void deleteCar(Cars cars);
    Cars updateCar(int id);
    List<Cars> getCars();

}
