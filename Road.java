
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Road{
    public static void main(String[] args) {
        //makes an arraylist of stations
        ArrayList<Station> Stations = new ArrayList<>();
        //adds 31 stations to the array list
        for (int i=0;i<=30;i++){
            Station a = new Station();
            Stations.add(a);
        }
         
        System.out.println("Testing info:");
        System.out.println("--------------");
        //Makes an arraylist of passengers
        ArrayList<Passenger> Passengers = new ArrayList<>();
        //adds 100 people to the arraylist
        for (int i=0;i<=100;i++){
            Passenger a = new Passenger();
            Stations.get(a.getPickup()).addPass(a);
            System.out.println(a);
            System.out.println("Dropoff: " + a.getDropoff());
            System.out.println("Pickup: " +a.getPickup());
            System.out.println();
        }
 
        System.out.println();
        //prints the number of stations
        System.out.println("Number of Stations: "+Stations.size());
        //prints all the stations
        System.out.println("Stations: "+ Stations);
        System.out.println();
  
        System.out.println("Fares: 10 dollars per mile");
        System.out.println();
  
        System.out.println("End of preliminary info.");
        System.out.println("---------------");
  
        System.out.println();
  
        //creates a car
        Car merc = new Car();
        //keeps track of the fares
        int fares = 0;
        
        //Goes through the stations
        for(int i=0; i<(Stations.size()); i++){
           //Goes through the passengers at the station
            for(Passenger j: Stations.get(i).getList()){
                if(merc.size()<=4 && (j.getDropoff()>j.getPickup())){
                    merc.addPassenger(j);
                    //Adds passengers if they qualify
                }
            }
            //Goes though the Passengers in car
            for(int h = 0; h<merc.size();h++){
                if(merc.getPass(h).getDropoff()==merc.getLocation()){
                    Stations.get(i).addPass(merc.getPass(h));
                    merc.removePassenger(merc.getPass(h));
                    //Adds the passenger to station if its their destination
                }
            }
            //Goes through and removes the duplicate passenger so they can't be in the car and station
            for(int k = 0; k<Stations.get(i).getList().size();k++){
                for(int l = 0; l<merc.size();l++){
                    if(merc.getPass(l) == Stations.get(i).getPass(k)){
                        Stations.get(i).remPass(Stations.get(i).getPass(k));
                    }
                }
            }
            //Adds fare per passenger to total
            fares += (merc.size()*10);
 
            //Moves the car forward
            merc.moveForward();
            //Prints output
            System.out.println(i);
            System.out.print("Train: ");
            merc.getCapacity();
            System.out.println("Station: " + Stations.get(i).getList());
            System.out.println();
        }
            //Prints total fares
            System.out.println("Fares: "+fares);
    }
}
 
 

