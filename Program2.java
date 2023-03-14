import java.util.Scanner;
public class Student {
    String Name,USN,Branch,Phone;
    void insertRecord() {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter Name:");
    	Name=sc.next();
    	System.out.println("Enter USN:");
    	USN=sc.next();
    	System.out.println("Enter Branch:");
    	Branch=sc.next();
    	System.out.println("Enter phone number:");
    	Phone=sc.next();
   }
    void displayRecord() {
    	System.out.println(USN+"\t"+Name+"\t"+Branch+"\t"+Phone+"\t");
    }
	public static void main(String[] args) {
	int i,n;
	Student s[]=new Student[100];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		s[i]=new Student();
		s[i].insertRecord();
	}
	System.out.println("****Student Information****");
	System.out.println("USN\t Name \tBranch\t Phone");
	for(i=0;i<n;i++)
	{
		s[i].displayRecord();
	}
	}

}
