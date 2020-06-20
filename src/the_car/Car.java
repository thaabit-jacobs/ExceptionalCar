package the_car;

import car_exceptions.CarNotStartedException;
import car_exceptions.CarOutOfFuelException;

public class Car {

    private boolean started =  false;
    private int fuelLevel = 0;

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void enterFuel() {
        fuelLevel += 20;
    }

    public boolean drive() throws CarNotStartedException, CarOutOfFuelException{
        if (!started) {
            throw new CarNotStartedException("Error when starting car Car not started");
        }

        if (fuelLevel <= 0) {
            started = false;
            fuelLevel = 0;
            throw new CarOutOfFuelException("Error when starting car Car out of fuel");
        }

        fuelLevel -= 5;

        return true;

    }


}
