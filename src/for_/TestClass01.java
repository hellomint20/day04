package for_;

import java.util.Scanner;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		for(초기값 ; 조건식 ; 증감식)
		{
			종속문장
		}
		다음문장
		-----------------
		반복문
		- 동일한 코드를 여러번 동작하고자 하는 경우
		- 규칙적으로 같이 변한다면 반복문을 사용할 수 있다.
		 */
		int sum =0;
		for(int i =1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);
		
		System.out.println("===== 증가식 =====");
		Scanner sc = new Scanner(System.in);
		int repet;
		System.out.print("반복 횟수 입력 : ");
		repet = sc.nextInt();
		for(int i =0; i<repet; i++)
			System.out.println(i+".번 반복");
		System.out.println("다음 문장들 실행");
		
		System.out.println("===== 감소식 =====");

		System.out.print("반복 횟수 입력 : ");
		repet = sc.nextInt();
		for(int i =10; repet<i; i--)
			System.out.println(i+".번 반복");
		System.out.println("다음 문장들 실행");
		
	}

}
