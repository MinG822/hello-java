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
		assertEquals(members.showMembers(), "2 회원님의 아이디는 2입니다");
		members.addMember(meber1);
		// assertEquals(members.size(), true); // ?? 왜 사용할 수 없지? Member 에 직접 메서드를 만들어줘야만 하나보다. extends 를 하지 않았으니 직접 메서드를 사용할 수 없음.. ArrayList 로 형변환해서 호출하는 것도 안됨..
		
		assertEquals(members.removeMember(1), true);
		assertEquals(members.removeMember(1), false);
		assertEquals(members.removeMember(2), true);
		assertEquals(members.showMembers(), "회원 정보가 없습니다.");;
		
	}

}
