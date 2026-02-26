package activity7;

public class SmartDevice {
    private String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        isOn = false;
    }

    public void togglePower() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void displayStatus() {
        System.out.println("Device Name: " + deviceName );
        System.out.println("Power: " + isOn);
      
    }
}
