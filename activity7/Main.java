package activity7;

public class Main {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Bumbilya ");
        SmartThermostat homeThermostat = new SmartThermostat("Termos ");

        livingRoomLight.togglePower();
        livingRoomLight.setBrightness(100);
        livingRoomLight.displayStatus();

        homeThermostat.togglePower();
        homeThermostat.setTemperature(22.5);
        homeThermostat.displayStatus();
    }


    
}
