package collection;
/*
 * �÷��� �������̽��� ������ List �������̽��� Set �������̽��� ����
 * List �� �������� ������, Set �� ������ ������� �ʰ�, �ߺ��� ������� ���� ���� ������ �ڷḦ �ٷ�� �������̽���
 * List �� ������ Ŭ�����δ� ArrayList, Vector, LinkedList, Stack, Queue �� �ְ�
 * Set �� ������ Ŭ�����δ� HashSet �� TreeSet �� �ִ�.
 * ��� add, clear, iterator, remove, size ���� �޼��带 ������ �ִ�
 */
public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}
	

}
