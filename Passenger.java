
/**
 * Write a description of class Passenger here.
 *
 * @Hudson 
 * @2-1-2022 
 */
import java.util.*;
public class Passenger
{
    //passenger class tracks the individual passenger's pickup and dropoff
    private int pickup;
    private int dropoff;
 
    public Passenger()
    {
        //creates a random pickup and dropoff for the passenger
        pickup = (int)(Math.random() * 31);
        dropoff = (int)(Math.random() * 31);
    }
    //returns pickup location for the passenger
    public int getPickup()
    {
        return pickup;
    }
    //returns the dropoff for the passenger
    public int getDropoff()
    {
        return dropoff;
    }
}
