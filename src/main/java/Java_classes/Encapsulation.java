
package Java_classes;

/**
 *
 * @author A
 */
public class Encapsulation {
    
    private String name;
    private String position;
    private double salary;
    
    public String getName(){
    return name;
    }
    
    public void setName(String Name){
        this.name=Name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String Pos){
        this.position=Pos;
 }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double sal){
        this.salary=sal;
    }
    
    public static void main(String args[]){
        Encapsulation empName= new Encapsulation();
        Encapsulation empPos= new Encapsulation();
        Encapsulation empSal= new Encapsulation();
        empName.setName("Awal");
        empPos.setPosition("Manager");
        empSal.setSalary(23000);
        
        System.out.println("Name is :"+empName.getName());
        System.out.println("Position is : "+empPos.getPosition());
        System.out.println("Salary per Annum is: "+empSal.getSalary());
    }
}

