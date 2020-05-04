package data;

public class Car extends Vehicle{
    private boolean isAirConditioningOn;
    private static final double AC_FUEL_CONSUMPTION = 0.8;

    public Car(String name, double tankCapacity, double averageFuelConsumption) {
        super(name, tankCapacity, averageFuelConsumption);
        isAirConditioningOn = false;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        isAirConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return isAirConditioningOn;
    }

    @Override
    public double calculateRange(){
        double currentFuelConsumption = getAverageFuelConsumption();
        if(isAirConditioningOn) {currentFuelConsumption+= AC_FUEL_CONSUMPTION;}
        return (getTankCapacity()/currentFuelConsumption)*100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", tankCapacity=" + getTankCapacity() +
                ", averageFuelConsumption=" + getAverageFuelConsumption() +
                ", rangeInKilometers=" + calculateRange() +
                ", isAirConditioningOn=" + isAirConditioningOn +
                '}';
    }
}
