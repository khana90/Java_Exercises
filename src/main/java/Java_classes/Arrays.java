
package Java_classes;
import java.util.ArrayList;
/**
 *
 * @author A
 */
public class Arrays {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(15);
    list.add(20);
    for (int i : list) {
      System.out.println("this is list:"+ i);
    }
  }
}
