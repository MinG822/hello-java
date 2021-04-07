package classpart;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
/* 
 classpart 패키지의 ShoppingOrder 클래스
 클래스 예제 문제 풀이
 */

public class ShoppingOrder {
	String orderNo;
	String userId;
	String orderDate;
	String username;
	String orderItemNo;
	String userAddress;
	DateTimeFormatter orderDateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	

	public void setOrder(String userId, String username, String userAddress, String orderItemNo) {
		this.userId = userId;
		this.username = username;
		this.userAddress = userAddress;
		this.orderItemNo = orderItemNo;
		this.orderDate = LocalDateTime.now().format(orderDateFormatter);
		this.orderNo = UUID.randomUUID().toString();
	}
	
	public void showOrder( ) {
		System.out.println("주문 번호: "+this.orderNo);
		System.out.println("주문자 아이디: "+this.userId);
		System.out.println("주문 날짜: "+this.orderDate);
		System.out.println("주문자 이름: "+this.username);
		System.out.println("주문 상품 번호: "+this.orderItemNo);
		System.out.println("배송 주소: "+this.userAddress);
	}
	

	
	public static void main(String[] args) {
		ShoppingOrder myShoppingOrder = new ShoppingOrder();
		myShoppingOrder.setOrder("munjiMon", "munji", "somewhere", "1");
		myShoppingOrder.showOrder();
		
	}

}
