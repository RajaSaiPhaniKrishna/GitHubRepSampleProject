package qedge.aug10;

import java.util.Iterator;

public class Array_in_single_dimension_with_for_each_loop {

	public static void main(String[] args) {
	//store integer type into array collection with single dimension
		int x[]=new int [5];
		x[0]=100;
		x[1]=200;
		x[2]=400;
		x[3]=600;
		x[4]=900;
//print length of array
		System.out.println(x.length);
//print specific element position in array collection
		System.out.println(x[3]);
//print each position value by using for each loop
		for (int phani : x) {
			System.out.println(phani);
			}
	
//store string type into array collection
		String z[]=new String[5];
		z[0]="300";
		z[1]="700";
		z[2]="800";
		z[3]="1000";
		z[4]="1200";
//print each position value in for each loop
		for (String Krishna : z) {
	System.out.println(Krishna);		
		} 
		}
}
