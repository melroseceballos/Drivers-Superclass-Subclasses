 /**
 * Used as a class for to create Colored Pencil object
 * 
 * @author     Ceballos, Melrose
 * @assignment ICS 111 Assignment 10
 * @date       April 7, 2023
 * @bugs       
 */
 
 public class ColoredPencils{
    private String color = " ";
    private String brand = " ";
    private double price = 0;
    
       /**
       * Constructs a ColoredPencil object
       *
       * @param   color     The Colored Pencil's color  
       * @param   brand     The Colored Pencil's brand  
       * @param   price     The Colored Pencil's price  
       */
       
      public ColoredPencils(String color, String brand, double price) {
      this.color = color;
      this.brand = brand;
      this.price = price;
      }
       /**
       * Changes instances using .set() mutator method
       * For example, changing color using .setColor()
       * Cyan.setColor(Blue);
       *     System.out.print("The color is: " + (Cyan.getColor()));  
       * This color is: Blue
       */
      public void setColor(String newColor) {
         this.color = newColor;
      }
      public void setBrand(String newBrand) { 
         this.brand = newBrand;
      }
      public void setPrice(int newPrice) {
         this.price = newPrice;
      }
      
       /**
       * Returns a printable string of instance variables using the get accessor method
       * For example, printing this.name using getColor()
       *    System.out.println("This is my favorite color: " + (Cyan.getColor()));
       * This is my favorite color: Cyan
       */
      public String getName() {
         return this.color;
      }
      
      public String getBrand(){
         return this.brand;
      }
      public double getPrice(){
         return this.price;
      }
     /**
       * Returns a printable string of instance variables
       * For example, an object new ColoredPencil ("Cyan, "Crayola", 1.99);
       *    Color: Cyan
       *    Brand: Crayola
       *    Price: $1.99
       */
      public String toString(){
         String output = " ";
         
         output += "Color: " + this.color;
         output += "\nBrand: " + this.brand;
         output += "\nPrice: " + "$" + this.price;
         
         return output;
      }
   }
   