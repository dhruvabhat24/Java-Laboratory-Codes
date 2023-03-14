import java.util.*;
public class ComputeArea {
	void area(double r)
	{
		double area;
		area=3.142*r*r;
		System.out.println("Area of circle:"+area+"Sq units");
	}
	 void area(float side)
	 {
		 double res;
		 res=Math.pow(side, 2);
		 System.out.println("Area of square:"+res+"Sq units");
	}
	 void area(float len,float wid)
	 {
		 double res=len*wid;
		 System.out.println("Area of rectangle:"+res+"Sq units");
	 }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ComputeArea c=new ComputeArea();
		System.out.println("Enter radius of circle");
		double r=s.nextDouble();
		c.area(r);
		System.out.println("Enter side of square");
		float x=s.nextFloat();
		c.area(x);
		System.out.println("Enter length and width of rectangle:");
		float l=s.nextFloat();
		float w=s.nextFloat();
		c.area(l,w);
	}

}
