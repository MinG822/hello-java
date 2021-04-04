package variable;
/*
 variable 패키지의 Conversion 클래스
 형 변환에 대해서 알아본다.
 
 서로 다른 자료형의 변수들의 연산을 수행할 때 같은 자료형으로 통일된다.
 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환, 
 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은
 자동으로(묵시적으로) 발생한다.
 위의 두 경우가 자동으로 형변환이 될 수 있는 이유는 자료의 손실이 발생하지 않기 때문.
 
 그 반대의 경우는 명시적으로 형 변환을 해주어야 한다.
 */
public class Conversion {

	public static void main(String[] args) {
		// 묵시적 형변환
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(iNum);
		float fNum = iNum;
		System.out.println(fNum);
		double dNum = fNum + iNum;
		System.out.println(dNum);
		
		// 명시적 형변환
		byte biNum = (byte)iNum;
		System.out.println(biNum);
		int diNum = (int)dNum;
		System.out.println(diNum);
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		int ch2 = 65;
		System.out.println((char)ch2);
		
		double dNum1 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum1; // 1 + 0
		int iNum4 = (int)(dNum1 + fNum1); // 2.1 -> 2
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
