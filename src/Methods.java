
public class Methods {

	public static void main(String[] args) {
		
		for(String arg : args ) {
			System.out.println(arg);
		}
        int result = addTwoNmbers(5,15);
        System.out.println(" result " +  result);
	}
	
	public static int addTwoNmbers(int n1,int n2) {
		System.out.println(n1 + n2);
		printMyName();
		return n1+n2;
	}
	
	public static void printMyName() {
		System.out.println("My name is venkat");
	}

}
