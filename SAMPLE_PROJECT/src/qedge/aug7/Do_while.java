package qedge.aug7;

public class Do_while {

	public static void main(String[] args) {
	//print odd numbers from 1 to 20	
		int i=1;
		do {
			System.out.println(i);
			i+=2;
		} while (i<=20);
		//print even numbers from 0 to 20
		int x=0;
		do {
			System.out.println(x);
			x+=2;
		} while (x<=20);
		//print prime numbers from 2 to 20
		int y=0;
		do {
			System.out.println(y++);
			y+=2;
			
			
		} while (y<=20);
	
		

	}

}
