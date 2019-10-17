package day12text;

public class Pig extends Pet{

	public Pig(String name) {
		super(name);
	}

	public Pig(String name, int full, int happy) {
		super(name, full, happy);
	}

	@Override
	public String cry() {
		return "ºßºß~";
	}

}
