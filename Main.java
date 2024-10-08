import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Circle circ1 = new Circle(10.1); //to make a new object you need to do new
    Circle circ2 = new Circle(14.0);
    Circle circ3 = new Circle(20.5);
    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());
    //Problem 2
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number for length and width: ");
    double eqLenWid = sc.nextDouble();
    Rectangle rect1 = new Rectangle(eqLenWid);
    System.out.println("Type a length: ");
    double len1 = sc.nextDouble(); 
    System.out.println("Type a width: ");
    double wid1 = sc.nextDouble();
    Rectangle rect2 = new Rectangle(len1, wid1);
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());
    //Problem 3
    System.out.println("Type a side length: ");
    double sideLength = sc.nextDouble();
    RegularPolygon triangle = new RegularPolygon(sideLength);
    System.out.println(triangle.toString());
    RegularPolygon square = new RegularPolygon(4, sideLength);
    System.out.println(square.toString());
  }
}