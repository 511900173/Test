package day1201µç×Ó³èÎï;

public class Dog extends Pet{

	
	
	public Dog(String name, int full, int happy) {
		super(name, full, happy);
		
	}

	public Dog(String name) {
		super(name);
		
	}

	@Override
	protected String cry() {
		return "Íô~";
	}

}
