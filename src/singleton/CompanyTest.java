package singleton;
/*
singleton 패키지의 Company 클래스
구현된 싱글톤 인스턴스를 테스트 해본다
*/
public class CompanyTest {

	public static void main(String[] args) {
		Company comp1 = Company.getCompany();
		Company comp2 = Company.getCompany();
		
		System.out.println(comp1 == comp2); // 두 변수가 같은 메모리 주소인지 확인

	}

}
