
package Polymorphsm;

import Polymorphsm.Vehicle;
import Polymorphsm.Vehicle.VIC;

/**
 *
 * @author A
 */
public class VehicleMain {
    public static void main(String args[]){
  
    Vehicle v= new Vehicle("Ford","Ka");
     
     Vehicle.VIC sd= v.new VIC("BMW","220d",9923332);
     
     System.out.println("Call mailCheck using vehicle reference --");   
      v.mailCheck();
      
 System.out.println("Call mailCheck using VIC reference --");   
      sd.mailCheck();
    }
}
