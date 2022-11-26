package myJava13;

public class Class6 {

	public static void main(String[] args) {
		int num = 12;
		int den[] = {12,0,3,0,0,4};
		
		for(int i = 0;i < 10;i++) {
			try {
				System.out.println("ans="+num/den[i]);
			}catch(Exception e) {
				System.out.println("捕捉到例外了");
			}
		}
	}

}
/*if(den.length < i || den[i] == 0) {
				System.out.println("error");
			}else {
				System.out.println("ans="+num/den[i]);
			}
*/