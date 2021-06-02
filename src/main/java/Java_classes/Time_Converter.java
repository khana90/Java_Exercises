package Java_classes;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Time_Converter {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int days=sc.nextInt();
        
        int hour= 24* days;
        int min=hour * 60;
        int sec=min * 60;
        
        System.out.println(sec);
    }
    
}
	