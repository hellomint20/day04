package for_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String season = "겨울";
		
		System.out.print("월을 입력해주세요 : ");
		month = sc.nextInt();
		
		if(month>=1 && month<=12) {
			switch(month/3) {
			case 1 : season = "봄"; break;
			case 2 : season = "여름"; break;
			case 3 : season = "가을"; break;
			}
			System.out.println("계절은 "+season+" 입니다.");
		}
		else
			System.out.println("월을 다시 입력해주세요");
	}

}
