package data;

public class Truck extends Car{
    private double loadWeight;
    private static final double AC_FUEL_CONSUMPTION     = 1.6;
    private static final double MASS_FUEL_CONSUMPTION   = 0.5;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption);
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateRange(){
        double currentFuelConsumption = getAverageFuelConsumption();
        if(super.isAirConditioningOn()) {currentFuelConsumption+= AC_FUEL_CONSUMPTION;}
        currentFuelConsumption += weightFuelConsumption();
        return (getTankCapacity()/currentFuelConsumption)*100;
    }

    private double weightFuelConsumption(){
        int additionalMassFuelConsumptionCounter = (int)(loadWeight/100);
        return MASS_FUEL_CONSUMPTION *additionalMassFuelConsumptionCounter;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + getName() + '\'' +
                ", tankCapacity=" + getTankCapacity() +
                ", averageFuelConsumption=" + getAverageFuelConsumption() +
                ", rangeInKilometers=" + calculateRange() +
                ", isAirConditioningOn=" + isAirConditioningOn() +
                ", loadWeight=" + loadWeight +
                '}';
    }
}
