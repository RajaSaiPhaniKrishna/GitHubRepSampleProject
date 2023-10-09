package qedge.aug8;

import java.util.Scanner;

public class nested_if__or____else_if {

	public static void main(String[] args) {
//verify given marks pass or fail by using scanner
Scanner s = new Scanner(System.in);
for(int i=1;i<=5;i++)
{
	System.out.println("Enter marks");
	int marks = s.nextInt();
	if (marks>=35)
	{
	System.out.println("pass    "+marks);
	}
else
{
	System.out.println("fail   "+ marks);
}
}
}
}
