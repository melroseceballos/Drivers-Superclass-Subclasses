/**
 * Used as a class for to create Teacher object
 * 
 * @author     Ceballos, Melrose
 * @assignment ICS 111 Assignment 10
 * @date       April 7, 2023
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class Teacher {
   private String name = " ";
   private int staffId = 0;
   private String subject = " ";
   
   /**
    * Constructs a Teacher object
    *
    * @param   name        The Teacher's name  
    * @param   staffId     The Teacher's staff ID
    * @param   subject     The Teacher's subject that they teach
    */
    
   
   public Teacher(String name, int staffId, String subject) { 
      this.name = name;
      this.staffId = staffId;
      this.subject = subject;
   
   }
   
    /**
    * Changes instances using .set() mutator method
    * For example, changing name using .setName()
    * Bee.setId(4004);
    *     System.out.print("Teacher Name: " + (Bee.getName()) + "\nStaff ID: " + (Bee.getId()));  
    * Teacher: Beyonce
    * Staff ID: 4004
    */
   public void setName(String newName) {
      this.name = newName; 
   } 
   public void setId(int newId){
      this.staffId = newId;
   }
   public void setSubject(String newSubject){
      this.subject = newSubject;
   }
   
    /**
    * Returns a printable string of instance variables using the get accessor method
    * For example, printing this.name using getName()
    *    System.out.println("This is my teacher's name: " + (Bee.getName()));
    * This is my teacher's name: Beyonce
    */
   public String getName(){
      return this.name;
  }
   public int getId(){
      return this.staffId;
  }
   public String getSubject(){
      return this.subject;
  }
  /**
    * Returns a printable string of instance variables
    * For example, an object new Teacher ("Beyonce, 0404, "Music");
    *    Teacher name: Beyonce
    *    StaffId: 0404
    *    Subject: Music
    */
    
   public String toString() {
   
      String output = " ";
      output += "Teacher name: " + this.name;
      output += "\nStaffId: " + this.staffId;
      output += "\nSubject: " + this.subject;
      
     return output;
     
   }
}