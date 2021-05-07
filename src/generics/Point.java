package generics;
/*
 * generics ��Ű���� Point Ŭ����
 * ���׸� Ÿ���� �Ű��������� ����ϴ� ���ϸ� �޼��带 Ȱ���ϱ�
 * 
 * public <,�� ���е� �Ű��������� ���׸� Ÿ��> ��ȯ�� �޼��� �̸�(���׸� Ÿ�Ե�) {}
 * �̶� ���׸� Ÿ���� �޼��� �������� ��ȿ�ϴ�
 */
public class Point<T,V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	

}