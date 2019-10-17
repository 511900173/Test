package day1201���ӳ���;

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
			System.out.println(name+"�Բ�����");
			return ;
		}
		System.out.println("��"+name+"ιʳ");
		full += 10;
		System.out.println("��ʳ�ȣ�"+full);
	}
	public void play() {
		if (full == 0) {
			System.out.println(name+"�����治����");
			return;
		}
		System.out.println("��"+name+"��ˣ");
		happy+=10;
		full-=10;
		System.out.println("���ֶ�"+happy);
		System.out.println("��ʳ��"+full);
	}
	public void punish() {
		System.out.println("��"+name+"��ƨƨ��"+name+"�޽У�"+cry());
		happy-=10;
		System.out.println("���ֶ�"+happy);
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
