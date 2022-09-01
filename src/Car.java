public class Car implements Vehicle {

    private int pass;
    private int wheel;
    private String colour;

    public Car(int pass, int wheel, String colour){
        this.pass = pass;
        this.wheel = wheel;
        this.colour = colour;
    }

    @Override
    public int getPassenger() {
        return pass;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public String getColour() {
        return colour;
    }
}
