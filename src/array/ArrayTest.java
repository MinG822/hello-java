package array;
/*
 array 패키지의 ArrayTest 클래스
 배열에 대해서 알아본다
 
 배열은 자료형이 같은 자료 여러 개를 한 번에 관리하는 구조
 
 배열 선언
  - 자료형[] 배열이름 = new 자료형[개수]
  - 자료형 배열이름[] = new 자료형[개수]
 
 배열 초기화
 
 배열의 인덱스값 사용
 배열의 물리적 위치와 논리적 위치는 같음
 */
public class ArrayTest {

	public static void main(String[] args) {
		// 배열 선언 : 
		int studentIds[] = new int[10];
		int[] studentIds2 = new int[10];
		// 배열 초기화
		//int[] studentIds3 = new int[3] {101, 102, 103}; // error
		int[] studentIds3 = new int[] {101, 102, 103};
		int[] studentIds4 = {201, 202, 203};
		
		int[] studentIds5;
		// studentIds5 = {100, 102}; // error
		studentIds5 = new int[] {100, 102};
		// studentIds5[2] = 103; index out of range
		
		int[] num = new int[10];
		System.out.print("초기화 전 배열 출력: ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			num[i] = i;
		}
		System.out.println();
		System.out.print("초기화 후 배열 출력: ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
