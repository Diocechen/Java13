package myJava13;

public class Class7 {
	public static void test(int num,int den) throws ArithmeticException{
		int ans = num/den;
		System.out.println(ans);
	}
	public static void main(String[] args) {
		try {
			test(12,0);
		}catch(ArithmeticException e) {
			System.out.println(e+" throwed");
		}
	}

}
