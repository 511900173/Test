package day1202哈希表;

public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		/*
		 * 使用属性数据，来计算哈希值 -相同属性数据，产生相同的哈希值 -不同属性数据，尽量产生不同的哈希值，尽量分散
		 * 
		 * 数学家发明的一种算法 是一种惯用的，有效算法
		 */
		int p = 31;// 固定的神奇值
		int r = 1;// 1可以随便写
		r = r * p + x;
		r = r * p + y;

		return r;
	}

	@Override
	public boolean equals(Object obj) {
		//参数对象obj是point类型
		if (obj instanceof Point) {
			//向下转型成point类型
			Point p = (Point) obj;
			//比较俩个实例中的x,y属性
			return x==p.x&&y ==p.y;
		}
		return false;
	}
}
