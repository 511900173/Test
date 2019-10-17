package day12text;

public abstract class Pet {
	private String name;
	private int full;
	private int happy;
	
	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	public Pet(String name) {
		this(name,50,50);
	}
	
	public void feed() {
		if (full==100) {
			System.out.println(name+"吃不下了");
			return;
		}
		full+=10;
		System.out.println("给"+name+"喂食");
		System.out.println("开心值"+happy+",饱食度"+full);
	}
	public void play() {
		if (full==0) {
			System.out.println(name+"饿的玩不动了");
			return;
		}
		happy+=10;
		full-=10;
		System.out.println(name+"玩了一下很开心");
		System.out.println("开心值"+happy+",饱食度"+full);
	}
	public void da() {
		System.out.println("打了"+name+"pp一下，"+name+"哭叫："+cry());
		happy-=10;
		System.out.println("开心值"+happy+",饱食度"+full);
	}
	
	public abstract String cry() ;
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
