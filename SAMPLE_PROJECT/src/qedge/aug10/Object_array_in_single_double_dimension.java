package qedge.aug10;

public class Object_array_in_single_double_dimension {

	public static void main(String[] args) {
	//store different data types
		Object x[]= new Object[5];
		x[0]= "hello";
		x[1]= 100;
		x[2]= 348.75;
		x[3]= 'c';
		x[4]= true;
		for (Object Raja : x) 
		{
		System.out.println(Raja);	
		}
//store different data types with double dimension
		Object y[][]= new Object [5] [2];
    y[0][0] ="user id1";
	y[0][1]=1234;
	y[1][0]="userid2";
	y[1][1]= 348.28;
	y[2][0]= "userid3";
	y[2][1]= 'R';
	y[3][0]= "userid4";
	y[3][1]= "sai";
	y[4][0]= "useid5";
	y[4][1]=246;
	//print row length
	System.out.println(y.length);
	//print cell (Or) column length
	System.out.println(y[0].length);
	//print specific row & column
	System.out.println(y[2][1]);
	//iterate all rows & columns 
	for(int k=0;k<y.length;k++)
	{
		for(int l=0;l<y[k].length;l++)
		{
			System.out.print(y[k][l]+"\t");
		}
	System.out.println();
	}
		
		
				

	}

}
