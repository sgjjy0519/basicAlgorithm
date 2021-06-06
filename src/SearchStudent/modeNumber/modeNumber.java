package modeNumber;
import java.util.Scanner;

public class modeNumber {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		Scanner s  = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			num[i] = s.nextInt();
		}
		//입력한 숫자 num
		// 1 2 2 3 1 4 2 2 4 3 
		
		//1 : 2
		//2 : 4 => 최빈수
		//3 : 2
		//4 : 2
		
		int[] mode = new int[10];
		
		//index => 출현횟수
		//index 값  => index(출현횟수)가 몇번 나왔는지 저장하는 용도
		// mode[3] = 5;  ==> 숫자 3이 5번 출현했다는 걸 의미.
		
		//입력한 숫자 num
		// 1 2 2 3 1 4 2 2 4 3 
		for(int i=0;i<mode.length;i++) {
			mode[num[i]]++;
		}
		
		int modeNum = 0; //최빈수
		int modeCnt = 0; //최빈수가 나온횟수
		
		for(int i=0;i<mode.length;i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 "+modeNum + "출현횟수는"+modeCnt);
		
	}

}
