package qedge.aug11;

public class String_functions {

	public static void main(String[] args) {
	//string functions
		
	    //length();
	    String str= "i want to get job in top mnc with 15 lakhs package";
		System.out.println(str.length());
		
		//equals();
		String str1 ="hello";
		String str2 ="Raja";
		String str3 ="hello";
		String str4 = "Hello";
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str4));
		
		//startswith();
		String Str ="Iam learning java";
		System.out.println(Str.startsWith("Ia"));
		System.out.println(Str.startsWith("Iam"));
		System.out.println(Str.startsWith("iam"));
		
		//endswith();
		System.out.println(Str.endsWith("java"));
		System.out.println(Str.endsWith("va"));
		System.out.println(Str.endsWith("learning"));
		
		//contains();
		System.out.println(Str.contains("ning"));
		System.out.println(Str.contains("am"));
		System.out.println(Str.contains(""));
		System.out.println(Str.contains("Learn"));
		//replace)();
		String Sr = "welcome into India";
		System.out.println(Sr.replace("into", "to"));
		
		String Sr1 = "my name is phani krishna";
		System.out.println(Sr1.replace("my name is", "myself"));
		
		//concat();
		String SR1 = "phani";
		String SR2 = "Krishna";
		System.out.println(SR1.concat(SR2));
		
		String SR3 = "abdul";
		String SR4 = "kalam";
		System.out.println(SR3.concat(SR4));
		
		//trim();
		 String TR1 = " i will attend          ";
		 String TR2 = "                  Classes";
		 String TR3 = "         i Want job";
		 System.out.println(TR1.trim());
         System.out.println(TR2.trim());
         System.out.println(TR3.trim());
         
         //split();
         String tr = "welcome to my wonderfull world";
         String x[]= tr.split("my");
         System.out.println(x[0]);
         System.out.println(x[1]);
         
         String dob = "6/11/1999";
         String y[] = dob.split("/");
         System.out.println(y[0]);
         System.out.println(y[1]);
         System.out.println(y[2]);

	
	
	}

}
