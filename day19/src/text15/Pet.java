package text15;

public abstract class Pet {
	private String name;
	private int full ;
	private int happy;
	
	public void eat() {
		if (full == 100) {
			System.out.println(name+"吃不下了");
		}
		full+=10;
		System.out.println("给"+name+"喂东西");
		System.out.println("饱食度:"+full);
		System.out.println("开心值:"+happy);
	}
	
	public void play() {
		if (full == 0) {
			System.out.println(name+"饿的玩不动了");
		}
		happy+=10;
		full-=10;
		System.out.println("陪"+name+"玩耍");
		System.out.println("饱食度:"+full);
		System.out.println("开心值:"+happy);
	}
	
	public void da() {
		System.out.println("打"+name+"的pp,"+name+"哭叫"+cry());
		if (happy == 0) {
			System.out.println(name+"不开心不理你了");
		}
		happy -= 10;
		full -= 10;
		System.out.println("饱食度:"+full);
		System.out.println("开心值:"+happy);
	}
	
	public abstract String cry();

	public Pet(String name) {
		this(name, 50, 50);
	}
	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFull() {
		return full;
	}
	public void setFull(int full) {
		this.full = full;
	}
	public int getHappy() {
		return happy;
	}
	public void setHappy(int happy) {
		this.happy = happy;
	}
	
	
}
