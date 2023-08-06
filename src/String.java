//import java.lang.*;
public class String {

	public static void main(java.lang.String[] args) {

		java.lang.String myName = "MATT";
		int length = myName.length();
		System.out.println("My Name is "+ myName);
		System.out.println("this has " + length + " characters");
		java.lang.String myNameUpper = myName.toUpperCase();
		System.out.println("My Name is " + myNameUpper);
		
		
		java.lang.String pharse = "Many hands make light work";
		System.out.println(pharse.startsWith("Many"));
		System.out.println(pharse.startsWith("many"));
		System.out.println(pharse.startsWith("Light"));
		System.out.println(pharse.startsWith("hello"));
		System.out.println(pharse.substring(16));
		System.out.println(pharse.substring(16, 21));
		System.out.println(pharse.replace("light", "heavy"));
		
		
		
		java.lang.String mysName = "Dale McGovern";
		java.lang.String yourName = "Dale Smethurst";
		
//		String myFirstName = (String) myName.subSequence(0, 4);
//		String YourFirstName = (String) yourName.subSequence(0, 4);
//		System.out.println(myFirstName);
//		System.out.println(yourName);
//		
//		boolean weHaveTheSameFirstName = myFirstName == yourName;
//		
//		System.out.println(weHaveTheSameFirstName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
