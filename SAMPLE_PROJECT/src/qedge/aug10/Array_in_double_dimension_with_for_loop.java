package qedge.aug10;

public class Array_in_double_dimension_with_for_loop {

	public static void main(String[] args) {
//array in double dimension with 5 rows&2 cells (or)columns
		String str[][] =new String[5][2];
		str[0][0]="admin1";
		str[0][1]="test1";
		str[1][0]="admin2";
		str[1][1]="test2";
		str[2][0]="admin3";
		str[2][1]="test3";
		str[3][0]="admin4";
		str[3][1]="test4";
		str[4][0]="admin5";
		str[4][1]="test5";
		//print row length
		System.out.println(str.length);
		//print cell (or)column length in any row
		System.out.println(str[0].length);
		//print test4 from array
		System.out.println(str[3][1]);
		//Iterate all rows & columns (or)cells by using for loop
		for(int i=0;i<str.length;i++)
		{
		for(int j=0;j<str[i].length;j++) {
		System.out.print(str[i][j]+"\t"); 
		}
		System.out.println();	
		}
	}
	}
