package day1201µç×Ó³èÎï;

public class Cat extends Pet{
	
	
	public Cat(String name, int full, int happy) {
		super(name, full, happy);
	}

	public Cat(String name) {
		super(name);
	}

	@Override
	protected String cry() {
		
		return "Ãé~";
	}
	
	
	
	
}
