
package Polymorphsm;

/**
 * 
 * @author A
 * this is just an exercise, practicing my technical skills
 */
public class Vehicle {
private String make;
private String model;

public Vehicle (String make, String model){
    this.make=make;
    this.model=model;
}

public void mailCheck(){
    System.out.println("mailing a check to"+" "+this.make+" "+this.model);
}
  public String toString() {
      return make + " " + model;
   }

  public void setMake(String newMake){
      make=newMake;
  }
  public String getMake(){
      return make;
  }
  public void setModel(String newModel){
      model= newModel;
  }
  public String getModel(){
      
      return model;
  }
  
  public class VIC extends Vehicle{
      private int VicNumber;

   public VIC(String make, String model, int VicNumber) {
            super(make, model);
            setVicNumber (VicNumber);
        }
      
    public void mailCheck() {
      System.out.println("Within mailCheck of Vehicle Details....> ");
      System.out.println("Mailing check to Car Make: " + getMake()
      + " Car Details " + VicNumber);
   }
        public int getVicNumber(){
            return VicNumber;
        } 
         public void setVicNumber(int newVicNumber){
             VicNumber=newVicNumber;
         }
         
  }

}
 