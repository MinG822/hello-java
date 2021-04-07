package constructor;
/*
constructor 패키지의 PersonTest 클래스
생성자에 대해서 알아본다

Person() 과 같은 함수를 생성자라고 함
생성자를 통해 처음 클래스를 생성할 때 값을 초기화 할 수 있다
생성자 이름은 클래스 이름과 같고 생성자는 반환 값이 없음

생성자 오버로드
아예 생성자가 없으면 컴파일러가 자동으로 디폴트 생성자를 생성해줌
있을 경우에는 디폴트 생성자가 있어야 new Person() 과 같이 인스턴스를 생성하는데 에러가 발생하지 않음
클래스에 생성자가 두 개 이상 제공되는 경우를 생성자 오버로드라고함
인스턴스를 생성할 때 원하는 생성자를 선택해서 사용할 수 있음

정보은닉, 코드 간결화 등의 이유로 매개변수가 있는 생성자를 구현해 사용하는 편이 편리한 경우가 많다
*/
public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person(); // 아예 생성자가 없거나 또는 생성자를 추가한 경우 디폴트 생성자를 추가해야 에러가 나지 않는다, 
		Person person2 = new Person(46.0f);
		Person person3 = new Person("person3");
		
		person2.name = "person2";
		person2.height = 100.0f;
	}
}
