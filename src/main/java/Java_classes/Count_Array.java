
package Java_classes;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class Count_Array {
 
    public static void main(String args[]){
        
        System.out.println("......Counting Array ......");
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mercedes"};
        System.out.println(cars.length);
        
       System.out.println("......Array list with size ......");    
        ArrayList<String> automobiles = new ArrayList<>();
        automobiles.add("Ford");
        automobiles.add("Toyota");
        automobiles.add(0, "volvo");
        automobiles.add(1,"Mercedese");
        for (int i = 0; i < automobiles.size(); i++) {

            System.out.println(automobiles.get(i));
    
}

    }
}
