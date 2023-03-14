
import java.util.Scanner;

public class QuadraticEquation
{
     public static void main(String args[])
     {
         double m=0,n=0,a,b,c,determinant,r;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the value of coefficient a:");
         a=s.nextDouble();
         System.out.println("Enter the value of coefficients b:");
         b=s.nextDouble();
         System.out.println("Enter the value of coefficient c:");
         c=s.nextDouble();
         determinant=(b*b)-(4*a*c);
         r=Math.sqrt(determinant);
         if(determinant >0)
         {
             m=(-b+r)/(2*a);
             n=(-b-r)/(2*a);
             System.out.println("The roots are real and distinct\n");
         }
         else
         {
             System.out.println("The roots are imaginary");
         }
     }
}
