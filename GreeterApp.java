import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greeter greeter = new Greeter("What up Doe");
		//LoudGreeter nikki=new LoudGreeter("Welcome to Detroit");
		//HTMLGreeter danielle=new HTMLGreeter("Hello");
//		
//		HTMLGreeter danielle2=new HTMLGreeter("Hello", "p");
//		System.out.println(greeter.greet("Heather"));
//		System.out.println(nikki.greet("Nikki"));
//		System.out.println(danielle.greet("Danielle"));
//		System.out.println(danielle2.greet("Danielle"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a Greeting");
		String greeting =scanner.next();
		System.out.println("Enter Your Name");
		String name =scanner.next();
		Greeter greeter2 = new Greeter(greeting);
		System.out.println(greeter2.greet(name));
		
		
		
		
		
	}

}
