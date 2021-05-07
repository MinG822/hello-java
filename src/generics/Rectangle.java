package generics;
/*
 * int, double, float, short, long, byte �ڷ���� ��ĳ������ �� double Ÿ������ ��ȯ
 * �� Number ������ �ٲ���?
 * ���̸� ���ϴ� ���� �� ��ȯ�� double ������ ������ �ֱ� ������, �־��� �Է��� double �� ��ȯ�ؾ��ϴµ�,
 * int -> double, float -> double ������ ��쿡�� ������ �߻��Ѵ� (variables ��Ű�� ����)
 * ���� Number �� �ٲ۴����� doubleValue �޼��带 ȣ���ؾ� ���� �ڷ������� �����ϰ� ��ȯ�� �� �ִ�
 * (�ڵ����� Ÿ���� �߷��ϴ� ���̽��̳� �ڹٽ�ũ��Ʈ�� �ٸ� ����)
 */
public class Rectangle {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
}
