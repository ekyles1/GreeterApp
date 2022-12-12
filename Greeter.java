
public class Greeter {
	private String greeting;
	public Greeter(String greeting) {
		//constructor
		this.greeting= greeting;
		
	}
	public String getGreeting() {
		//getter
		return greeting;
	}
	public void setGreeting(String newGreeting) {
		this.greeting = newGreeting;
	}
	public String greet(String name) {
		return this.greeting + ","+ name+"!";
	}
}
