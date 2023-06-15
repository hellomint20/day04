package switch_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*System.out.println("===== Quiz 01 =====");
		Scanner sc = new Scanner(System.in);
		int day;
		while(true) {
			System.out.print("날짜를 입력해주세요 : ");
			day = sc.nextInt();
			switch(day%7) {
			case 1: System.out.println(day +": 월요일"); break;
			case 2: System.out.println(day +": 화요일"); break;
			case 3: System.out.println(day +": 수요일"); break;
			case 4: System.out.println(day +": 목요일"); break;
			case 5: System.out.println(day +": 금요일"); break;
			case 6: System.out.println(day +": 토요일"); break;
			case 0: System.out.println(day +": 일요일"); 
			}
		}
		*/
		System.out.println("===== Quiz 02 =====");
	 	Scanner sc = new Scanner(System.in);
		int num;
		String home=null, com=null;
		while(true) {
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		System.out.print(">>> : ");
		num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("우리집 등록 : ");
				home = sc.next();
				System.out.println("등록 성공");
				break;
			case 2:
				System.out.println("회사 등록 : ");
				com = sc.next();
				System.out.println("등록 성공");
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+com);
				break;
			default:
				System.out.println("1~3사이의 숫자를 입력해주세요");
			}
		}
		
		
		
		
	}

}
