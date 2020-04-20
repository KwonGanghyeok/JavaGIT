/*
 * 문제1
 * 구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을 작성하되 2단은 2x2까지,
 * 4단은 4x4까지 6단은 6x6가지, 8단은 8x8까지 출력하도록 작성하자.
 */
public class Ex07 {
	public static void main(String[] args) {
		for(int i = 2; i < 9; i = i+2) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i+"x"+j+"="+i*j);
				
			}
		}
	}

}
