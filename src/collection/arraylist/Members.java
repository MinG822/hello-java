package collection.arraylist;
/*
 * ArrayList �ڷ����� Ȱ���� ȸ������ ���α׷��� �����Ѵ�
 * ȸ������ ���α׷������� ȸ���� �߰��ϰ�, �����ϰ�, ȸ�������� ����� �� �ִ�
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
		return "ȸ�� ������ �����ϴ�.";
	}
}
