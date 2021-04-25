package object;

import java.util.HashSet;
/*
 * object ��Ű���� HashCodeTest Ŭ����
 * object Ŭ������ �޼��� �� hashCode() �޼��带 �˾ƺ���
 * 
 * hash �� ������ �����ϰų� �˻��� �� ����ϴ� �ڷᱸ��
 * hash�Լ�(��ü�� Ư������) = ��ü������ġ
 * ��ü ������ġ�� ������ �˻��� �� �ִٴ°� ����
 * �ڹٿ��� �ν��Ͻ��� �� �޸𸮿� ������ ������ �� �ؽ� �˰����� ����Ѵ�
 * 
 * �� �ν��Ͻ��� �������� ������ equals �� �����ߴٸ� ���ۿ��� ���ϱ� ���� hashCode �޼��带 �������ϴ� �� ����
 * ���� ��� equals true �� �� �ν��Ͻ��� HashSet �� �־��� �� �� �ν��Ͻ��� ���� �ٸ� ��ü�� �ν�������
 * hashCode �޼��� ��ȯ���� ��ġ�ϵ��� �����θ� �� �ν��Ͻ��� ���� ��ü�� �ν��Ѵ�.
 * �Ʒ��� hashCode �޼��忡 ���� �ڹ� �ڸ�Ʈ�̴�
 * hashCode : Indicates whether some other object is "equal to" this one.
 * 
 * ����) �׷����� ���� �� �ν��Ͻ��� ������ ��ġ�� �ٸ���, == �� ���غ��� false �� ������ �Ϳ��� Ȯ���� �� �ְ�
 * System.identityHashCode �ε� Ȯ���� �� �ִ�
 */

class HashStudent extends Student {
	public HashStudent(int studentId, String studentName) {
		super(studentId, studentName);
	}
	
	public int hashCode() {
		return studentId;
	}
}

public class HashCodeTest {

	public static void main(String[] args) {
		HashSet<Student> hsset = new HashSet<Student>();
		
		Student studentA = new Student(123, "a");
		Student studentB = new Student(123, "a");
		Student studentC = studentA;
		
		System.out.println(studentA.equals(studentB));
		System.out.println(studentA == studentB);
		
		hsset.add(studentA);
		hsset.add(studentB);
		System.out.println(hsset.size());
		hsset.add(studentC);
		System.out.println(hsset.size());
		
		HashStudent studentD = new HashStudent(123, "a");
		HashStudent studentE = new HashStudent(123, "a");
		
		System.out.println(studentD.equals(studentE));
		System.out.println(studentD == studentE);
		hsset.add(studentD);
		hsset.add(studentE);
		System.out.println(hsset.size());
		
		System.out.println(System.identityHashCode(studentE));
		System.out.println(System.identityHashCode(studentD));
	}

}
