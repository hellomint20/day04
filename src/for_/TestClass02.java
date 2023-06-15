package for_;

public class TestClass02 {

	public static void main(String[] args) {
		int i;
		for(i =1; i<10; i +=2) {
			System.out.println("i : "+i);
		}
		
		System.out.println("===================");
		for(i=1; i<=10; i++) {
			if(i%2==0) System.out.println("짝수");
			else System.out.println("홀수");
		System.out.println("++++++++");
		}
	
		//무한적으로 실행됨 
		/*System.out.println("===================");
		for( ; ; ) {
			System.out.println("test");
		}*/
		i =0;
		for(;i<5;) {
			System.out.println("i : "+i);
			i++;
		}
	}
}
