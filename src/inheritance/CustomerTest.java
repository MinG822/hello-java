package inheritance;
/*
inheritance 패키지의 CustomerTest 클래스
Customer 를 테스트한다.

VIPCustomer 의 showSuperHash 와 showHash 가 같은데
하위 클래스에서 super를 통해 상위클래스에 접근할 때
힙메모리에서 하위클래스의 영역 중 상위 클래스의 부분을 접근한다는 게 정확할 것 같다.

하위클래스를 생성하며 상위클래스 형으로 선언할 때는
하위클래스 생성자가 호출되기 전에 상위 클래스 생성자가 호출되는 것까지 같은데
만들어진 하위클래스의 멤버변수나 메서드에 접근할 수 없게 된다.

그렇지만 메서드가 하위클래스에서 재정의되었다면 해당 인스턴스는 재정의된 메서드를 호출함
이를 가상 메서드라고 함
멤버변수는 힙메모리에 위치해 인스턴스가 생성될 때마다 새로 생성되지만, 
메서드의 명령 집합은 코드영역에 위치해있는데, 메서드를 호출할 때 해당 영역을 참조해 명령을 실행

즉 vvmong 의 calcPrice 메서드와 vmong 의 calcPrice 는 같은 메모리 영역을 참조하고 있어 같은 값이 반환된다

*/
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer mong = new Customer(1010, "mong");
		mong.bonusPoint = 1000; // 보너스 포인트를 protected 로 설정해야하지 않나
		System.out.println(mong.showCustomerInfo());
		
		
		VIPCustomer vmong = new VIPCustomer(1010, "vip mong", 1004);
		vmong.bonusPoint = 10000;
		System.out.println(vmong.showVIPInfo());
		
		mong.showHash();
		vmong.showSuperHash();
		vmong.showHash();
		
		Customer vvmong = new VIPCustomer(1011, "vvip mong", 1004); // 업캐스팅
		vvmong.showCustomerInfo();

//		vvmong.showSuperHash(); 참조할 수 없다
//		VIPCustomer mmong = new Customer(1011, "mmong"); 상위클래스를 생성하며 하위클래스 형으로 지정할 수 없다.
		
		int price = 10000;
		printCustomerPrice(mong, price);
		printCustomerPrice(vmong, price);
		printCustomerPrice(vvmong, price); // 주의) 묵시적 형변환된 인스턴스의 메서드는 재정의된 메서드를 호출
	}
	
	public static void printCustomerPrice(Customer targetCustomer, int price) {
		System.out.println(targetCustomer.getCustomerName() + "님이 지불해야 하는 금액은" + targetCustomer.calcPrice(price) + "원 입니다.");
	}

}
