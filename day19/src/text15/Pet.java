package text15;

public abstract class Pet {
	private String name;
	private int full ;
	private int happy;
	
	public void eat() {
		if (full == 100) {
			System.out.println(name+"�Բ�����");
		}
		full+=10;
		System.out.println("��"+name+"ι����");
		System.out.println("��ʳ��:"+full);
		System.out.println("����ֵ:"+happy);
	}
	
	public void play() {
		if (full == 0) {
			System.out.println(name+"�����治����");
		}
		happy+=10;
		full-=10;
		System.out.println("��"+name+"��ˣ");
		System.out.println("��ʳ��:"+full);
		System.out.println("����ֵ:"+happy);
	}
	
	public void da() {
		System.out.println("��"+name+"��pp,"+name+"�޽�"+cry());
		if (happy == 0) {
			System.out.println(name+"�����Ĳ�������");
		}
		happy -= 10;
		full -= 10;
		System.out.println("��ʳ��:"+full);
		System.out.println("����ֵ:"+happy);
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
