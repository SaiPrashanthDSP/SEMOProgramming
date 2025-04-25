
import java.util.*;

class GeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

}
class Triangle extends GeometricObject{
private double side1;
private double side2;
private double side3;

Triangle(){
}
Triangle(double side1,double side2, double side3){
this.side1=side1;
this.side2=side2;
this.side3=side3;
}
public double getSide1(){
return this.side1;
}
public double getSide2(){
return this.side2;
}
public double getSide3(){
return this.side3;
}
public double getArea(){
double s= (side1+side2+side3)/2.0;
return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}
public double getPerimeter(){
return side1+side2+side3;
}
@Override
public String toString(){
return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;
}
public static void main(String[] args){
Scanner sd = new Scanner(System.in);
System.out.print("Enter the Three sides of the triangle:");
double side1=sd.nextDouble();
double side2=sd.nextDouble();
double side3=sd.nextDouble();
System.out.print("Enter the color of the triangle:");
String color=sd.next();
System.out.print("Is the triangle filled?:");
boolean filled=sd.nextBoolean();

Triangle triangle = new Triangle(side1,side2,side3);

triangle.setColor(color);
triangle.setFilled(filled);
System.out.println("---------------------------------------------------------");
System.out.println("The area of Triangle is: "+triangle.getArea());
System.out.println("The perimeter of a triangle is: "+triangle.getPerimeter());
System.out.println("The color of the triangle: "+triangle.getColor());
System.out.println("Is filled triangle?: "+triangle.isFilled());
}
}