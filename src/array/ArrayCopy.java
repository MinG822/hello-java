package array;
/*
 array ��Ű���� ArrayCopy Ŭ����
 ��ü �迭�� �����غ���
 System.arraycopy(������ �迭, ������ ù ��ġ, �ٿ����� �迭, �ٿ����� ù ��ġ, ������ ��� ����)
 */
public class ArrayCopy {

	public static void main(String[] args) {
		int[] targetArr = {10, 20, 30, 40};
		int[] newArr = new int[4];
		
		System.arraycopy(targetArr, 0, newArr, 1, 2);
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}

	}

}
