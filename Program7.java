public class Constructor_Overloading {
	double width;
	double heigth;
	double depth;
	private double height;
	
	// Constructor used when all dimensions specified 
	Constructor_Overloading(double w,double h,double d){
		width=w;
		heigth=h;
		depth=d;
	}
// Constructor used when no dimensions specified 
	Constructor_Overloading(){
		width=-1;
		heigth=-1;
		depth=-1;
	}
	// constructor used when cube is created
	Constructor_Overloading(double len){
		width=height=depth=len;
	}
	/// Compute and return volume
	double volume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
	// Create boxes using the various Constructors
		Constructor_Overloading mybox1=new Constructor_Overloading(10,20,15);
		Constructor_Overloading mybox2= new Constructor_Overloading();
		Constructor_Overloading mycube=new Constructor_Overloading(7);
		double vo1;
		// get volume of first box
		vo1=mybox1.volume();
		System.out.println("Volume of Box 1 is "+vo1);
		// get volume second box
		vo1=mybox2.volume();
		System.out.println("Volume of Box with unkown dimensions is"+vo1);
		//get volume of cube 
		vo1=mycube.volume();
		System.out.println("Volume of cube is"+vo1);
	}
}
