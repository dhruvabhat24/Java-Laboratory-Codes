import java.util.Scanner;
class Staff
{
	String id,name;
	long phone,salary;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the staf Id:");
		id=s.nextLine();
		System.out.println("Enter the staff name");
		name=s.nextLine();
        System.out.println("Enter the phone number:");
        phone=s.nextLong();
        System.out.println("Enter the Salary");
        salary=s.nextLong();
	}
	void display()
	{
		System.out.println("Staff id:"+id+"\nName:"+name+"\nPhone Number:"+phone+"Salary"+salary);
	}
}
class Teaching extends Staff
{
	String domain;
	int n;
	Scanner s=new Scanner(System.in);
	void read()
	{
		super.read();
		System.out.println("Enter the domain of Teachng Staff");
		domain=s.nextLine();
		System.out.println("Enter the total number of Publications");
		n=s.nextInt();
	}
	void dispaly()
	{
		System.out.println("Domain:"+domain+"No.of pblications"+n);
	}
}
class Technical extends Staff
{
	String skills;
	Scanner s=new Scanner(System.in);
	void read()
	{
		super.read();
		System.out.println("Enter the skills of Technical Staff");
		skills=s.nextLine();
	}
	void dispaly()
	{
		super.display();
		System.out.println("Skills:"+skills);
	}
}
class Contract extends Staff
{
	int period;
	Scanner s=new Scanner(System.in);
	void read()
	{
		super.read();
		System.out.println("Enter the contract period in years");
		period=s.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Contract period:"+period);
	}
}
public class Staffmain {

	public static void main(String[] args) {
	Teaching t=new Teaching();
	Technical tech=new Technical();
	Contract c=new Contract();
    System.out.println("Enter the trainng Staff information");
    t.read();
    System.out.println("Enter the Technical staff Information");
    tech.read();
    System.out.println("Enter the contract basis staff information");
    c.read();
    System.out.println("\\***Teachiing Staff Information***");
    t.display();
    System.out.println("\n\n***Technical Staff Information***");
    tech.display();
    System.out.println("\n\nContract Basis Staff Information***");
    c.display();
	}

}
