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

		System.out.println("==================");
		int even = 0;
		int odd = 0;
		
		System.out.print("입력: ");	
		int n1 = sc.nextInt();
		
		for(int i = 1; i <= n1; i++ ) {
			if(i % 2 == 0) 
				even += i;	
			else 
				odd += i;	
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
	}

}
