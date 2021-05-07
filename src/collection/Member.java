package collection;
/*
 * 컬렉션 인터페이스는 하위에 List 인터페이스와 Set 인터페이스가 있음
 * List 는 순차적인 구조로, Set 은 순서를 상관하지 않고, 중복을 허용하지 않은 집합 구조로 자료를 다루는 인터페이스다
 * List 를 구현한 클래스로는 ArrayList, Vector, LinkedList, Stack, Queue 가 있고
 * Set 을 구현한 클래스로는 HashSet 과 TreeSet 이 있다.
 * 모두 add, clear, iterator, remove, size 등의 메서드를 가지고 있다
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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}
	

}
