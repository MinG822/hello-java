package array;
/*
array ��Ű���� BookArray Ŭ����
������ �迭�� ���� �˾ƺ���
*/
public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] multiArr = {{10,11,12},{20,21,22}};
		
		for(int i = 0; i < multiArr.length ; i++) {
			for(int j = 0; j < multiArr[i].length ; j++) {
				System.out.print(multiArr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
