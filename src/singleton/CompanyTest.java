package singleton;
/*
singleton ��Ű���� Company Ŭ����
������ �̱��� �ν��Ͻ��� �׽�Ʈ �غ���
*/
public class CompanyTest {

	public static void main(String[] args) {
		Company comp1 = Company.getCompany();
		Company comp2 = Company.getCompany();
		
		System.out.println(comp1 == comp2); // �� ������ ���� �޸� �ּ����� Ȯ��

	}

}
