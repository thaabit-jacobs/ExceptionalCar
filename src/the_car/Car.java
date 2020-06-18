package the_car;

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

    public boolean drive() {
        if (!started) {
            return false;
        }

        if (fuelLevel <= 0) {
            started = false;
            fuelLevel = 0;
            return false;
        }

        fuelLevel -= 5;

        return true;

    }


}
