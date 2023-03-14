import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 double a,b;
		 System.out.println("Enter two numbers A and B:");
         a=s.nextDouble();
         b=s.nextDouble();
         System.out.println("Enter the operator");
         char op=s.next().charAt(0);
         switch(op)
         {
         case '+': System.out.println("A+B"+(a+b));
         			break;
         case '-': System.out.println("A-B"+(a-b));
         			break;
         case '*': System.out.println("A*B"+(a*b));
         			break;
         case '/': System.out.println("A/B"+(a/b));
         			break;
         case '%': System.out.println("A%B"+(a%b));
         			break;
         case '^': System.out.println("A^B"+Math.pow(a, b));
         			break;
         default: System.out.println("Invalid operator");
        	 
         }
         
	}

}
