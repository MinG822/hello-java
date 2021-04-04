package ifexample;
/*
 ifexmaple 패키지의 SwitchCase 클래스
 switch case 문에 대해서 알아본다.
 
 조건문을 구현할 때 조건이 많아지면 if 로 구현하기 번거롭다.
 이때 만약 조건이 하나의 변수 값이나 상수값으로 구분된다면 switch case 문을 사용한다
 */
public class SwitchCase {

	public static void main(String[] args) {
		int rank = 0;
		char medalColor;
		switch(rank) {
		case 1 : medalColor = 'G';
		break; // switch case 문의 수행을 멈추고 빠져나가도록 만든다
		case 2 : medalColor = 'S';
		break;
		case 3: medalColor = 'B';
		break;
		default : medalColor = 'A'; // 위 세 경우 모두 해당하지 않을 때
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
//			break; // break 를 수행하지 않으면 switch 문 실행을 멈추지 않아 default 값이 된다.
		default : day = 0;
		}
		System.out.println(day);
		
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달 입니다");
			break;
		case "Silver":
			System.out.println("은메달 입니다");
			break;
		case "Bronze":
			System.out.println("동메달 입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
			break;
		}
	}

}
