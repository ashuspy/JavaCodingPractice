package Oops;

class Main {
    public static void main(String[] args) {
        Inverter PCU = new SolarInverter(2, 5, false, true);
        Inverter GTI = new SolarInverter(3, 10, true, false);
        Inverter Regalia = new SolarInverter(5, 10, true, true);
        Inverter Zelio = new NonSolarInverter(7, 14);

        System.out.println("PCU  :");
        PCU.getInverterDetails();

        System.out.println("GTI  :");
        GTI.getInverterDetails();

        System.out.println("Regalia  :");
        Regalia.getInverterDetails();

        System.out.println("Zelio  :");
        Zelio.getInverterDetails();
    }
}

class Inverter {
    double current;
    double operatingVoltage;
    boolean hasSolarPanels;
    boolean hasBattery;
    boolean isGrid;

    Inverter(double current, double operatingVoltage, boolean isGrid, boolean hasBattery, boolean hasSolarPanels){
        this.current=current;
        this.operatingVoltage=operatingVoltage;
        this.isGrid=isGrid;
        this.hasBattery=hasBattery;
        this.hasSolarPanels=hasSolarPanels;
    }
    public double getPowerRating() {
        return current * operatingVoltage;
    }
    public void getInverterDetails() {
        System.out.printf("Inverter Power rating is %f%n", getPowerRating());
        System.out.printf("Has Battery: %s%n", hasBattery ? "true" : "false");
        System.out.printf("Has Solar Panels: %s%n", hasSolarPanels ? "true" : "false");
        System.out.printf("Has Grid On Feature: %s%n%n", isGrid ? "true" : "false");
    }
}

class SolarInverter extends Inverter {
    SolarInverter(double current, double operatingVoltage, boolean isGrid, boolean hasBattery) {
        super(current, operatingVoltage, isGrid, hasBattery, true);
    }
}

class NonSolarInverter extends Inverter {
    NonSolarInverter(double current, double operatingVoltage) {
        super(current, operatingVoltage, false, true, false);
    }
}
