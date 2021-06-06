package SearchStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("손흥민","13-04395");
		Student st2 = new Student("황의조","15-19234");
		Student st3 = new Student("이재성","15-23149");
		Student st4 = new Student("이청용","16-23912");
		
		ArrayList<Student> list = new ArrayList<Student>(); 
		//지네릭스, Student 타입만 리스트에 추가가능
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		// list에 추가되었는지 확인
		// 처음부터 끝까지 반복
		// for(타입 변수 : 배열,리스트)
//		for(Student stu : list) { 
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());
//		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("학번검색 프로그램입니다. 숫자를 입력해주세요.");
		
		
		while(true) { 
			System.out.println("검색을 계속 진행 => 1 , 종료=> 2");
			System.out.print("입력 : ");
			
			int input = s.nextInt();
			if(input == 1) {
				System.out.println("검색이 시작되었습니다.");
				
				System.out.println("학생의 이름을 입력하세요");
				System.out.print("이름 입력 : ");
				String name = s.next();
				boolean flag = false;  
				// false이면 53라인 if문으로 꼬우
				// 49라인이 거짓일경우 else if를 쓰지 않는 이유는 48라인의 for문에서 걸리기때문에 flag 사용
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) { //문자열비교는 .equals() // ==은 주소비교
						System.out.println(name+" 학생의 학번은 "+stu.getNo()+" 입니다.");	
						flag = true;
					}	
				}		
				if(!flag) { 
					System.out.println("등록되지 않은 학생입니다.");
				}
				
			}else if(input == 2) {
				break; //반복문 탈출
			}
			
		}
		
		System.out.println("검색이 종료되었습니다.");
		
	}

}
