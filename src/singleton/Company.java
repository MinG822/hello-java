package singleton;
/*
 singleton 패키지의 Company 클래스
 싱글톤 패턴에 대해서 알아보고 구현해본다
 
 싱글톤 패턴은 단 하나의 인스턴스만 생성하는 디자인 패턴이다
 (디자인 패턴은 프로그램 특성에 따라 설계 유형을 이론화한 내용)
 
 아래 예시는 하나의 회사 객체에 여러 직원들이 존재하는 경우에 회사 객체를 싱글톤으로 생성하는 코드
 1. 생성자를 private 로 만들기
 	: 클래스 외부에서 회사 객체를 만들 수 없음
 2. 클래스 내부에 static 으로 유일한 인스턴스 생성하기
 	: 유일하게 존재할 수 있는 인스턴스인데, 
 	static 변수이기 때문에 외부에서 Company.theCo 로 유일한 인스턴스에 접근 할 수 있도록함
 3. 외부에서 참조할 수 있는 public static 메서드 만들기
 	: 이때 외부에서 접근하려면 public 이며 static이어야 인스턴스 생성없이 접근할 수 있음
 4. 실제로 사용하는 코드 만들기
 */
public class Company {
	private static Company theCo = new Company(); 
	private Company() {} // 클래스 외부에서 
	
	public static Company getCompany() {
		if (theCo == null) {
			// 이런 경우가 있을 수 있나?
			theCo = new Company();
		}
		return theCo;
	}
}
