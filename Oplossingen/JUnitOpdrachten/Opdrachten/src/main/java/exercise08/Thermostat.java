package exercise08;

public class Thermostat {
    private Heating heating;
    private Temperature currentTemperature;
    private Temperature targetTemperature;
    private boolean status;

    public Thermostat(Heating heating) {
        this.heating = heating;
        this.currentTemperature = new Temperature(0);
        this.targetTemperature = new Temperature(0);
        evaluate();
    }

    public void setCurrentTemperature(Temperature t) {
        currentTemperature = t;
        evaluate();
    }

    public void setTargetTemperature(Temperature t) {
        targetTemperature = t;
        evaluate();
    }

    public boolean isHeating() {
        return status;
    }

    private void evaluate() {
        status = currentTemperature.getValue() < targetTemperature.getValue();
        heating.setHeating(status);
    }
}
