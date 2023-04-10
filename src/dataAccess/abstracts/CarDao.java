package dataAccess.abstracts;

import entities.Cars;
import java.util.List;

public interface CarDao {

    void addCar(Cars cars);

    void deleteCar(Cars cars);

    Cars updateCar(int id);

    List<Cars> getCars();

}
