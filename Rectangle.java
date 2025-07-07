
public class Rectangle {
   // 1. Private double data field named width to store the rectangle width (default value is 1.00).
   // 2. Private double data field named height to store the rectangle height (default value is 1.00).
   private double width;
   private double height;

   // 3. Non-argument constructor method that creates a default rectangle (with default values).
   public Rectangle(){
      this.width = 1.00;
      this.height = 1.00;
   }
   
   // 4. Constructor method that creates a rectangle with specified width and height values.
   public Rectangle(double width, double height){
      this.width = width;
      this.height = height;
   }
   
   // 5. Get methods for the data fields width and height.
   public double getWidth(){
     return this.width; 
   } 
   public double getHeight(){
     return this.height; 
   }
   
   // 6. Method named getArea() that returns the area of the rectangle.
   public double getArea(){
      return this.width * this.height;
   }
   
   // 7. Method named getPerimeter() that returns the perimeter of the rectangle.
   public double getPerimeter(){
      return 2 * (this.width + this.height);
   }
   
   // 8. Method toString(String objectName)to printout a meaningful description of a rectangle object.
   public String toString(String recName) {
      //return String.format("\nRectangle: \t %s  \n---------------------------\nWidth: \t\t%.2f  \nHeight: \t\t%.2f \nArea: \t\t%.2f \nPerimeter: \t%.2f", name, this.width, this.height, getArea(), getPerimeter());
      return String.format("Rectangle %s is %.2f units wide and %.2f units high.", recName, width, height);
   }
}


