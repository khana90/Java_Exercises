package Java_classes;

/**
 *
 * @author A
 */
public class ForLoop1 {
    //stop the loop at 5
    public static void main(String arg[]){
        for(int i=1; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);

        }
        System.out.println(".....sum of arrays..........");
        //advance array and its sum
          int[] array = {10, 20, 30, 40, 50, 10};
      int sum = 0;
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);

        
    }
}
