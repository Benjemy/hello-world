import java.util.Scanner;
public class Exceptionsmall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.next());
		try{
			if(a<100){
				throw new numException("�������Ӧ�ô���100.");
			}
			if(a>1000){
				throw new numException("�������Ӧ��С��1000.");
			}
		}catch(numException n){
			System.out.println(n.getMessage());
			a=Integer.parseInt(sc.next());
		}
	}
	
}
class numException extends Exception{
	public numException(String s) {
		 super(s);
	}
}
