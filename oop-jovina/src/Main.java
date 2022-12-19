import geometry.Point;
import geometry.Line;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Donut;

public class Main
{
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 5);
		Point p2 = new Point(4, 5);
		
		Line l1 = new Line(p1, new Point(10, 10));
		Line l2 = new Line(p1, new Point(9, 10));
		
		Circle c1 = new Circle(p1, 6);
		Circle c2 = new Circle(p2, 6);
		
		Donut d1 = new Donut(p2, 4, 16);
		Donut d2 = new Donut(p1, 4, 16);
		
		
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(d1);
		
		System.out.println(p1.equals(p2));
		System.out.println(l1.equals(l2));
		System.out.println(c1.equals(c2));
		System.out.println(d1.equals(d2));
		
		System.out.println(p1.equals(p1));
		System.out.println(l2.equals(l2));
		System.out.println(c1.equals(c1));
		System.out.println(d2.equals(d2));
	}
}
