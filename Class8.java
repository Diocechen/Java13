package myJava13;

class Ctest{
	public static void test(int num,int den) throws ArithmeticException{
		int ans = num/den;
		System.out.println(ans);
	}
}
public class Class8 {
	
	public static void main(String[] args) {
		try {
			Ctest.test(12,0);
		}catch(ArithmeticException e) {
			System.out.println(e+" throwed");
		}
	}

}
