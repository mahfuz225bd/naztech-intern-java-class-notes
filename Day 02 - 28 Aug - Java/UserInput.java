import java.util.Scanner;

class UserInput {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("What is you name?: ");
		
		String name;
		name = myScanner.nextLine();

		// Output: Welcome, {Inputed name}
		System.out.println("Welcome, " + name);
	}
}