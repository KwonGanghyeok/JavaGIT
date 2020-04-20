/*
 * 다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성해보자
 *  A B
 * +B A
 *  9 9
 */
public class Ex08 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if((i+j)==9) {
					System.out.println(" A = "+i+" B = "+j);
				}
			}
		}
	}
}
