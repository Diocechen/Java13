package myJava13;

class NotTriangle extends Exception{
}
class EquilaterialTriangle extends Exception{
}
class NotEquilaterialTriangle extends Exception{
}
public class Class12 {

	public static void main(String[] args) throws NotTriangle, EquilaterialTriangle, NotEquilaterialTriangle {
		int a = 3;
		int b = 0;
		int c = 1;
		triangle(a,b,c);
	}
	public static void triangle(int a,int b,int c) throws NotTriangle,EquilaterialTriangle,NotEquilaterialTriangle{
		if((a+b)<c || (a+c)<b || (b+c)<a) {
			System.out.println("不構成三角形");
			throw new NotTriangle();
		}else if(a==b && a==c && b==c) {
			System.out.println("這是正三角形");
			throw new EquilaterialTriangle();
		}else {
			System.out.println("這不是正三角形");
			throw new NotEquilaterialTriangle();
		}
	}
}
