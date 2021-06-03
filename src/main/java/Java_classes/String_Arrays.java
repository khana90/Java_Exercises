
package Java_classes;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class String_Arrays {
    public static void main(String args[]){
        
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);

    }
  System.out.println("......Array list ......");
    ArrayList<Integer> list= new ArrayList();
    list.add(12);
    list.add(234);
    list.add(1);
    list.add(19);
    for(int i:list){
    System.out.println("list of items: "+i);
    }
    
    }
}
