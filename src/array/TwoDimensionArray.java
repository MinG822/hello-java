package array;
/*
array 패키지의 BookArray 클래스
다차원 배열에 대해 알아본다
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
