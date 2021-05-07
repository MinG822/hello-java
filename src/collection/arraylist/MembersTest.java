package collection.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import collection.Member;

class MembersTest {

	@Test
	void test() {
		Members members = new Members();
		Member meber1 = new Member(1, "1");
		Member meber2 = new Member(2, "2");

		members.addMember(meber2);
		assertEquals(members.showMembers(), "2 ȸ������ ���̵�� 2�Դϴ�");
		members.addMember(meber1);
		// assertEquals(members.size(), true); // ?? �� ����� �� ����? Member �� ���� �޼��带 �������߸� �ϳ�����. extends �� ���� �ʾ����� ���� �޼��带 ����� �� ����.. ArrayList �� ����ȯ�ؼ� ȣ���ϴ� �͵� �ȵ�..
		
		assertEquals(members.removeMember(1), true);
		assertEquals(members.removeMember(1), false);
		assertEquals(members.removeMember(2), true);
		assertEquals(members.showMembers(), "ȸ�� ������ �����ϴ�.");;
		
	}

}
