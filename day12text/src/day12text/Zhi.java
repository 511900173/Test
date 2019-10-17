package day12text;

public class Zhi extends Pet{

	public Zhi(String name, int full, int happy) {
		super(name, full, happy);
	}
	public Zhi(String name) {
		super(name);
	}

	@Override
	public String cry() {
		return "֨֨~";
	}

	
}
