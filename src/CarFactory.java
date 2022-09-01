public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle create(int pass, int wheel, String colour) {
        return new Car(pass, wheel, colour);
    }
}
