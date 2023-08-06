
public class Variable {

	public static void main(String[] args) {
		int i=1;
		System.out.println("this will get output");
		System.out.println(i);
		int j;
		j = 2;
		System.out.println(j);
		long myVariable = 17L;
		long anotherVariable = 3000000000L;
		double myDouble = 17.3;
		float myFloat=17.3F;

		double someOtherVariable = 17;
		someOtherVariable=14.2;

		int first =50;
		int second =100;
		int third = first;
		first =65;

		System.out.println("first" + first);
		System.out.println("second"+second);
		System.out.println("third"+ third); 

		double weExpect = (double)second /  first;
		System.out.println("100 divided by 65 is " + weExpect);

		System.out.println(first + 1);

		int myAge = 21;
		myAge++;
		System.out.println(myAge);
		System.out.println(--myAge);
		System.out.println(++myAge);

		myAge += 5;//myAge = myAge + 5;
		myAge -=1;
		System.out.println(myAge);

		int result = 26/7;
		System.out.println(result);

		int modulus = 26%7;
		System.out.println(modulus);

		// boolean iAmYoungerThan30 = false;

		// String myFirstNameStartWith ="M";

		int[] myArray = {1,2,3,4,5};
		System.out.println(myArray[4]);

		myArray[3] = 17;
		System.out.println(myArray[3]);

	}

}
