import java.util.IdentityHashMap;
import java.util.Map;

public class VehicleFactoryRegistry {


    Map<String, VehicleFactory> factories = new IdentityHashMap<>();

    public void register(String key, VehicleFactory factory){
        if (!factories.containsKey(key)) factories.put(key, factory);
    }

    public Vehicle create(String key, String colour, int pass, int wheel){
        VehicleFactory factory = factories.get(key);
        return factory.create(pass, wheel, colour);
    }
}
