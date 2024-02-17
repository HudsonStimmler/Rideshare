/**
* Write a description of class CombinationLock here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.*;
public class Car{
    //the car class tracks an arraylist of passengers, the cars location, and the cars dropoff
    private ArrayList<Passenger> capacity;
    private int location;
    private int destination;
 
    public Car(){
        //implements a location of 0, a dropoff of 31, and a new arraylist for the passengers
        location = 0;
        capacity = new ArrayList<>();
        destination = 31;
    }
     //adds a given passenger to the arraylist - simulates a passanger being added to a car
    public void addPassenger(Passenger a){
        if(capacity.size()<=4 && (a.getDropoff()>a.getPickup())){
            capacity.add(a);
        }
    }
    //removes a given passenger from the arraylist - simulates a passanger being removes from a car
    public void removePassenger(Passenger a){
        if(a.getDropoff()==location){
            capacity.remove(a);
        }
    }
     //moves the car forward by 1 station
    public void moveForward(){
        location++;
    }
    //moves the car backwards by 1 station
    public void moveBackwards(){
        location--;
    }
     //returns the location of the car
    public int getLocation(){
        return location;
    }
    //returns the destination of the car
    public int getDestination(){
        return destination;
    }
    //returns the amount of people in the car
    public int size(){
        return capacity.size();
    }
    //returns the people in the car
    public void getCapacity(){
        System.out.println(capacity);
    }
 
    public ArrayList<Passenger> getList(){
        return capacity;
    }
 
    public Passenger getPass(int a){
        return capacity.get(a);
    }
}
 
 
