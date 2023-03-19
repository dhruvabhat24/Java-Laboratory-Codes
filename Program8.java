//Write a program to generate the resume. Create 2 Java classes Teacher
//(data: personal information, qualification, experience, achievements) and Student
//(data: personal information, result, discipline) which implements the java interface
//Resume with the method biodata().
import java.util.*;// pointer provides the address of object in the memory
interface Resume{;
void biodata();
}
class Teacher implements Resume{

	@Override
	public void biodata() {
		String name,dob,age,bg,qualification;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr name,date of birth(DD/MM/YYYY),age,blood group of the teacher");
		name=s.nextLine();
		dob=s.nextLine();
		age=s.nextLine();
		bg=s.nextLine();
		System.out.println("Enetr the qualification,experiene in terms of year,achievements ");
		qualification=s.nextLine();
		String experience=s.nextLine();
		String achievement=s.nextLine();
		System.out.println("\n\n*Resume of Teacher*\n\n");
		System.out.println("Name:"+name+"Date of Birth:"+dob+"Age:"+age+"Blood group:"+bg+"Qualification:"+qualification+"Achivements:"+achievement+"Experience:"+experience);
	}
	}
	class Student1 implements Resume{

		@Override
		public void biodata() {
			String name,Dob,bg,age;
			Scanner s=new Scanner(System.in);
			System.out.println("Enetr the Name,date of birth(DD/MM/YYYY),blood group of the student");
			name=s.nextLine();
			Dob=s.nextLine();
			bg=s.nextLine();
			age=s.nextLine();
			System.out.println("Enetr the Disipline 1.Branch 2.Sem 3.Section");
			String branch=s.nextLine();
			String Sem=s.nextLine();
			String Section=s.nextLine();
			System.out.println("Enetr the results 1.percentage 2.CGPA");
			float percentage=s.nextFloat();
			float CGPA=s.nextFloat();
			System.out.println("Name:"+name+"Date of Birth:"+Dob+"Age:"+age+"Blood group:"+bg+"Disipline Data:"+"Branch:"+branch+"Sem:"+Sem+"Section:"+Section+"*Results*"+"Percentage:"+percentage+"CGPA:"+CGPA);
		}
		
}
public class MainClass {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		Student1 s=new Student1();
		t.biodata();
		s.biodata();
	}
}
