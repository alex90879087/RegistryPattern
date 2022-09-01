import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApplication {

    private List<Vehicle> garage = new ArrayList<>();
    VehicleFactoryRegistry registry = new VehicleFactoryRegistry();

    public void register(String key, VehicleFactory factory){
        registry.register(key, factory);
    }

    public static void main(String[] args) {
        VehicleApplication client = new VehicleApplication();


        client.register("bike", new BikeFactory());
        client.register("car", new CarFactory());

        client.garage.add(client.registry.create("bike", "Red",2, 2));
        client.garage.add(client.registry.create("Car", "Black", 5,4));

    }
}
