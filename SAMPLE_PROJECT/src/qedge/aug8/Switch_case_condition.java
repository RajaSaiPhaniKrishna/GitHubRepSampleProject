package qedge.aug8;

import java.util.Scanner;

public class Switch_case_condition {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
for (int x=1;x<=10;x++) {
	System.out.println("Enter course name");
	String course = s.next();
	switch(course.toUpperCase())
	{
	case "SELENIUM":
	System.out.println("course is available   "+ course);
	break;
	case "manual":
	System.out.println("course is available  "+ course);
	break;
	case "python":
		System.out.println("course is available  "+ course);
		break;
	case "java":
		System.out.println("course is available  " + course);
		break;
	case "data science":
	System.out.println("course is available   "+ course);
	break;
	default:
		System.out.println("course is not available  "+ course);
		break;
	}


		
}
	}

}
