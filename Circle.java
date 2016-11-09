//Q1
public class Circle
{
	static double radius;
	double rad;
	public Circle()
	{
		radius=10;
		rad=5;
	}
	public static double Area(double r)
	{
		return 3.14*r*r;
	}
	public double Volume(double r)
	{
		return 3.14*r*r*r;
	}
	public static void main(String[] args)
	{
	//	System.out.println(Circle.Area(circ.radius));
		//non-static method Volume(double) cannot be referenced from a static context
		//System.out.println(Circle.Volume(circ.rad));
		//non-static method Volume(double) cannot be referenced from a static context		
		Circle circ=new Circle();
//Q1(i)
		System.out.println(circ.Area(circ.radius));
		
//Q1(ii)
		System.out.println(circ.Volume(circ.radius));
//Q1(iii)
		System.out.println(circ.Area(circ.rad));
//Q1(iv)
		System.out.println(circ.Volume(circ.rad));

		
		
	}
}	