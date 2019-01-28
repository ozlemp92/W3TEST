package com.ozlem.w3test;

public class test {
	int x = 112;
	public static void main( String[] args )
    {
		whiletest();
		myMethod();
		System.out.println(multiplemethod(30));
		checkAge(20); 
		test myObj = new test();
		    System.out.println(myObj.x);
}
	private static void whiletest() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
			if(i==5)
			{
			continue;
			}
			if(i==9)
			{
			break;
			}	
	}
	}
	  static int multiplemethod(int x) {
		    return 5 * x;
		  }
	  static void myMethod() {
		    System.out.println("I just got executed!");
		  }
  static void checkAge(int age)
  {
	  if(age<18)
	  {
		  System.out.println("Access denied - You are not old enough!"); 

	  }
	  else
	  {
		  System.out.println("Access granted - You are old enough!"); 
	  }
  }
}