package day1201电子宠物;

public abstract class Pet {
	private String name;
	private int full;
	private int happy;	
	
	public Pet(String name) {
		this(name, 50, 50);
	}
	
	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	public void feed() {
		if (full == 100) {
			System.out.println(name+"吃不下了");
			return ;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度："+full);
	}
	public void play() {
		if (full == 0) {
			System.out.println(name+"饿的玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		happy+=10;
		full-=10;
		System.out.println("快乐度"+happy);
		System.out.println("饱食度"+full);
	}
	public void punish() {
		System.out.println("打"+name+"的屁屁，"+name+"哭叫："+cry());
		happy-=10;
		System.out.println("快乐度"+happy);
	}
	
	protected abstract String cry();
	
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
