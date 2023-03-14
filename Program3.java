import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 0,i,m,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n1=s.nextInt();
		m=n1-1;
		if(n1==0||n1==1)
		{
			System.out.println("The number is not a prime number");
		}
		else
		{
			for(i=2;i<m;i++)
			{
				if(n%2==0)
				{
					System.out.println("The number is a Prime Number");
					flag=1;
					break;
				}
				if(flag==0)
				{
					System.out.println("The number is a prime number");
				}
			}
				
		}

	}

}
