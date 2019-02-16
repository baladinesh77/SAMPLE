package demo1;

public class Greeter {

	private String name;
	
	public Greeter() {
		super();
		System.out.println("New instance created");
	}
	
	public void greet() {
		
		System.out.println("welcome "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
