public class BikeFactory implements  VehicleFactory{
    @Override
    public Vehicle create(int pass, int wheel, String colour) {
        return new Bike(pass, wheel, colour);
    }
}
