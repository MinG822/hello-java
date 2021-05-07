package collection.arraylist;
/*
 * ArrayList 자료형을 활용해 회원관리 프로그램을 구현한다
 * 회원관리 프로그램에서는 회원을 추가하고, 삭제하고, 회원정보를 출력할 수 있다
 */
import java.util.ArrayList;
import collection.Member;

public class Members {
	private ArrayList<Member> members;
	
	public Members() {
		members = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			int tmpId = member.getMemberId();
			if(tmpId == memberId) {
				members.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public String showMembers() {
		for(Member member : members) {
			return member.toString();
		}
		return "회원 정보가 없습니다.";
	}
}
