package activity7;

public class SmartLight extends SmartDevice {
    private int brightnessLevel;

    public SmartLight(String deviceName) {
        super(deviceName);
        brightnessLevel = 0;
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightnessLevel = level;
        } else {
            System.out.println("Brightness between 0 and 100.");
        }
    }

    public int getBrightness() {
        return brightnessLevel;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness Level: " + brightnessLevel);
    }

}
