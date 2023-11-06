package boattracker.boats;
import boattracker.internal.*;
import java.util.ArrayList;

public class Boat {

    private String modelNumber;
    private String boatColor;
    private double boatPrice = 0.0;
    private ArrayList<Employee> users = new ArrayList<Employee>();

    public Boat(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getBoatColor() {
        return boatColor;
    }

    public double getBoatPrice() {
        return boatPrice;
    }
}