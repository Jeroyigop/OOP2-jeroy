package activity7;

public class Main {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("balcon ");
        SmartThermostat homeThermostat = new SmartThermostat("kalapaw ");

        livingRoomLight.togglePower();
        livingRoomLight.setBrightness(100);
        livingRoomLight.displayStatus();

        homeThermostat.togglePower();
        homeThermostat.setTemperature(22.5);
        homeThermostat.displayStatus();
    }


    
}
