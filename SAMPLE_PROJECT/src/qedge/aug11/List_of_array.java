package qedge.aug11;

import java.util.ArrayList;

public class List_of_array {

	public static void main(String[] args) {
ArrayList <String>cars = new ArrayList<String>();
cars.add("Tatapunch");
cars.add("TataNexon");
cars.add("Tatatigor");
cars.add("Tataharrier");
cars.add("Tatasafari");
cars.add("mahindraxuv200");
cars.add("mahindraxuv300");	
cars.add("mahindraxuv700");
//print Collection number
System.out.println(cars.size());
//print specific element position value in collection
System.out.println(cars.get(6));
	for(int r=0;r<cars.size();r++)
	{
		System.out.println(cars.get(r));
	}
	
	
	}

}
