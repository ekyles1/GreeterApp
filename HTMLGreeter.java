
public class HTMLGreeter extends Greeter{
	private String tagName;
	public HTMLGreeter(String greeting) {
		super(greeting);
		//constructor
		this.tagName= "h1";
		
	}
	public HTMLGreeter(String greeting, String tagName) {
		super(greeting);
		//constructor
		this.tagName= tagName;
	}
	public String getTagName() {
		//getter
		return this.tagName;
	}
	public void setTagName(String newTagName) {
		this.tagName = newTagName;
	}
	@Override
	public String greet(String name) {
		return "<" + this.tagName+">"+ super.greet(name)+ "</" + this.tagName+">";
	}
}