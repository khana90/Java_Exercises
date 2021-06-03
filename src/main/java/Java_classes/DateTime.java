
package Java_classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author A
 */
public class DateTime {

    
     public static void main(String args[]){
  
 double time=07;
 
 if(time<10){
     System.out.println("Good Morning");
 }else if(time<20){
     System.out.println("Good Afternoon");
 }else{
     System.out.println("Good Evening");
 }
 if(time<=20){
     System.out.println("This is local time");
     LocalDateTime mydate= LocalDateTime.now();
     DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = mydate.format(dateFormat);
  System.out.println(formattedDate);

 }
 
   
     }
    
}



