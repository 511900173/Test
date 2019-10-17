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
			System.out.println(name+"�Բ�����");
			return;
		}
		full+=10;
		System.out.println("��"+name+"ιʳ");
		System.out.println("����ֵ"+happy+",��ʳ��"+full);
	}
	public void play() {
		if (full==0) {
			System.out.println(name+"�����治����");
			return;
		}
		happy+=10;
		full-=10;
		System.out.println(name+"����һ�ºܿ���");
		System.out.println("����ֵ"+happy+",��ʳ��"+full);
	}
	public void da() {
		System.out.println("����"+name+"ppһ�£�"+name+"�޽У�"+cry());
		happy-=10;
		System.out.println("����ֵ"+happy+",��ʳ��"+full);
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
