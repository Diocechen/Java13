package myJava13;

public class Class4 {

	public static void main(String[] args) {
		int num = 12;
		int den[] = {12,0,3,0,0,4};
		
		for(int i = 0;i < 10;i++) {
			if(den.length < i || den[i] == 0) {
				System.out.println("執行程式有誤");
			}else {
				System.out.println("ans="+num/den[i]);
			}
		}
	}

}
