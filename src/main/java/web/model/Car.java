package web.model;

public class Car {
    private String modelCar;
    private String colorCar;
    private int mileageCar;

    public Car(String modelCar, String colorCar, int mileageCar) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.mileageCar = mileageCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getMileageCar() {
        return mileageCar;
    }

    public void setMileageCar(int mileageCar) {
        this.mileageCar = mileageCar;
    }

}
