
/**
 * Write a description of class Station here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Station{
    // the station class keeps track of an arraylist of passengers
    private ArrayList<Passenger> list;
  
    public Station(){
        //creates the arraylist
        list = new ArrayList<>();
    }
     //returns the passenger at the given index
    public Passenger getPass(int i){
        return list.get(i);
 
    }
     //adds passenger to the arraylist
    public void addPass(Passenger p){
        list.add(p);
    }
     //removes passenger from the arraylist
    public void remPass(Passenger p){
        list.remove(p);
    }
     //returns the arraylist
    public ArrayList<Passenger> getList(){
        return list;
    }
     //returns the size of the arraylist
    public int getSize(){
        return list.size();
    }
  
}
