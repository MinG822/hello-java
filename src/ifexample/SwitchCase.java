package ifexample;
/*
 ifexmaple ��Ű���� SwitchCase Ŭ����
 switch case ���� ���ؼ� �˾ƺ���.
 
 ���ǹ��� ������ �� ������ �������� if �� �����ϱ� ���ŷӴ�.
 �̶� ���� ������ �ϳ��� ���� ���̳� ��������� ���еȴٸ� switch case ���� ����Ѵ�
 */
public class SwitchCase {

	public static void main(String[] args) {
		int rank = 0;
		char medalColor;
		switch(rank) {
		case 1 : medalColor = 'G';
		break; // switch case ���� ������ ���߰� ������������ �����
		case 2 : medalColor = 'S';
		break;
		case 3: medalColor = 'B';
		break;
		default : medalColor = 'A'; // �� �� ��� ��� �ش����� ���� ��
		}
		System.out.println(medalColor);

		int month = 2;
		int day;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12 : day = 31;
		break;
		case 4: case 6: case 9: case 11 : day = 30;
		break;
		case 2: day = 28;
//			break; // break �� �������� ������ switch �� ������ ������ �ʾ� default ���� �ȴ�.
		default : day = 0;
		}
		System.out.println(day);
		
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴� �Դϴ�");
			break;
		case "Silver":
			System.out.println("���޴� �Դϴ�");
			break;
		case "Bronze":
			System.out.println("���޴� �Դϴ�");
			break;
		default:
			System.out.println("�޴��� �����ϴ�");
			break;
		}
	}

}
