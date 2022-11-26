package myJava13;
import java.util.*;
class Exception520 extends Exception{
}
public class Class13 {

	public static void main(String[] args) throws Exception520 {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		if(in.equals("520")) {
			System.out.println("這是由字串520引起的事件");
			throw new Exception520();
		}else {
			System.out.println(in);
		}
		
	}

}
