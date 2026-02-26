package activity7;

public class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
        temperature = 20.0;
    }

    public void setTemperature(double temp) {
        if (temp >= 10.0 && temp <= 30.0) {
            temperature = temp;
        } else {
            System.out.println("Temperature must be between 10 and 30 degrees Celsius.");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Current Temperature: " + temperature + " °C");
    
    }
}