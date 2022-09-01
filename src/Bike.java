public class Bike implements Vehicle{
    private int pass;
    private int wheel;
    private String colour;
    private String model;


    public Bike(int pass, int wheel, String colour){
        this.pass = pass;
        this.wheel = wheel;
        this.colour = colour;
//        this.model = model;
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

    public String getModel() {
        return model;
    }
}
