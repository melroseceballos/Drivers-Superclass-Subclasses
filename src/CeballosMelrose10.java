/**
 * This program is used as a driver to call on methods and create objects from classes
 * 
 * @author     Ceballos, Melrose
 * @assignment ICS 111 Assignment 10
 * @date       April 7, 2023
 * @bugs      
 */
 
 public class CeballosMelrose10{
    public static void main(String[] args){
   System.out.println("This program models a school");
   System.out.println("This model contains 2 objects: Teacher, Colored Pencil");
   System.out.println("\n");
   
   // object for teacher class
   System.out.println("I am printing the Teacher object with System.out.println(Bee.toString())");
   Teacher Bee = new Teacher ("Beyonce", 0404, "Music");
   System.out.println(Bee.toString());
   
   System.out.println("\n");
   
   // object for colored pencils class
   System.out.println("I am priting the ColorPencil object with System.out.println(Cyan)");
   ColoredPencils Cyan = new ColoredPencils ("Cyan", "Crayola", 1.99);
   System.out.println(Cyan);
   
   // Using set method to change staff ID
   System.out.println("\nI am using a set method to change the Teacher object Beyonce's Staff ID to 4004, then printing again");
   Bee.setId(4004);
   System.out.print("Teacher Name: " + (Bee.getName()) + "\nStaff ID: " + (Bee.getId()));  
   
   System.out.println("\n");
   
   // Using get method to print the color
   System.out.println("\nI am using a get method to print the color in this sentence: ");
   System.out.println("My favorite color is: " + (Cyan.getName()));
    }
 }