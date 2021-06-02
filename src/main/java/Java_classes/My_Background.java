package Java_classes;


/**
 *
 * @author A
 */
public class My_Background {
    
  String name = "Awal Khan";
  int age = 31;
  String firstDegree="Bachelor";
  String scndDegree ="Masters";
  String course ="Computer Science";
  String Uni1= "London South Bank University";
  String Uni2 ="University of Greenwich";
  String nationality="British";
String CurrentSt ="Looking For Work";

  public static void main(String[] args) {
    My_Background myObj = new My_Background();
    System.out.println("-------------My Background------------");
    System.out.println("Name: " + myObj.name);
    
    System.out.println("Age: " + myObj.age);
    System.out.println("My First Degree : " + myObj.firstDegree);
     System.out.println("My Second Degree: " + myObj.scndDegree);
     System.out.println("Both Courses : " + myObj.course);
     System.out.println("First University : " + myObj.Uni1);
      System.out.println("Second University : " + myObj.Uni2);
       System.out.println("Nationality : " + myObj.nationality);
       System.out.println("Working Status : " + myObj.CurrentSt);
       
try {
   java.net.URI uri = new java.net.URI( "https://github.com/khana90?tab=repositories" );
                System.out.println("Check out my GitHub account : " + uri);
            }
            catch ( Exception e ) {
                System.err.println( e.getMessage() );
            }
  }
}

