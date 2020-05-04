package data;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double calculateRange(){
        return (tankCapacity/averageFuelConsumption)*100;
    }

    public String getName() {
        return name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumption=" + averageFuelConsumption +
                ", rangeInKilometers=" + calculateRange() +
                '}';
    }
}
