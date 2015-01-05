/**
 * Created by wwadge on 01/01/15.
 */
public abstract class Vehicle implements Transport{

    private String colour; // state

    public String getColour() {            // behaviour
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract int getNumberOfWheels();
}
