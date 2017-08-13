import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangle tr=new Triangle();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		try{
			tr.sanjiao(A,B,C);
		}
		catch(lllegalArgrmenException l){
			System.out.println(l.getMessage());
		}
			finally{
			System.out.println("三边长分别为："+A+" "+B+" "+C+" ");
		}
	}
	public void sanjiao(int a,int b,int c) throws lllegalArgrmenException{
		if(a+b<=c|a+c<=b|b+c<=a){
			throw new lllegalArgrmenException(a+""+b+""+c+"不能构成三角形");
		}
	}
}
class lllegalArgrmenException extends Exception{
	public lllegalArgrmenException(String s) {
		super(s);
	}
}
