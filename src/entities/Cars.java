package entities;

public class Cars {

    int carId; // Car manufacture id number
    String brand;
    String model;
    int manufactureYear;
    String motorType;

    public Cars(int carId, String brand, String model, int manufactureYear, String motorType) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.motorType = motorType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
