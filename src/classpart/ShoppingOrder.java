package classpart;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
/* 
 classpart ��Ű���� ShoppingOrder Ŭ����
 Ŭ���� ���� ���� Ǯ��
 */

public class ShoppingOrder {
	String orderNo;
	String userId;
	String orderDate;
	String username;
	String orderItemNo;
	String userAddress;
	DateTimeFormatter orderDateFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
	

	public void setOrder(String userId, String username, String userAddress, String orderItemNo) {
		this.userId = userId;
		this.username = username;
		this.userAddress = userAddress;
		this.orderItemNo = orderItemNo;
		this.orderDate = LocalDateTime.now().format(orderDateFormatter);
		this.orderNo = UUID.randomUUID().toString();
	}
	
	public void showOrder( ) {
		System.out.println("�ֹ� ��ȣ: "+this.orderNo);
		System.out.println("�ֹ��� ���̵�: "+this.userId);
		System.out.println("�ֹ� ��¥: "+this.orderDate);
		System.out.println("�ֹ��� �̸�: "+this.username);
		System.out.println("�ֹ� ��ǰ ��ȣ: "+this.orderItemNo);
		System.out.println("��� �ּ�: "+this.userAddress);
	}
	

	
	public static void main(String[] args) {
		ShoppingOrder myShoppingOrder = new ShoppingOrder();
		myShoppingOrder.setOrder("munjiMon", "munji", "somewhere", "1");
		myShoppingOrder.showOrder();
		
	}

}
