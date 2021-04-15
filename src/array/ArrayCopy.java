package array;
/*
 array 패키지의 ArrayCopy 클래스
 객체 배열을 복사해본다
 System.arraycopy(복사할 배열, 복사할 첫 위치, 붙여넣을 배열, 붙여넣을 첫 위치, 복사할 요소 개수)
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
