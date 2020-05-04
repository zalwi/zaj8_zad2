import data.Car;
import data.Truck;
import data.Vehicle;

public class AutomotiveDealer {
    public static void main(String[] args) {
        Vehicle[] vehicles = {  new Vehicle("Gokart", 80,8),
                                new Car("Samochód", 60, 10),
                                new Truck("Ciężarówka", 1000, 25,4000)};

        for(Vehicle v: vehicles){
            System.out.println(v.toString());
            // włącz klimę dla samochodów i cieżarówek
            if(v instanceof Car || v instanceof Truck){
                ((Car) v).setAirConditioningOn(true);
            }
            // ponownie sprawdz zasiegi
            System.out.println(v.toString());
        }
    }
}
