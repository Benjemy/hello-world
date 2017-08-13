import java.util.Scanner;
public class Trianglearea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    Sanj s=new Sanj(sc.nextInt(),sc.nextInt(),sc.nextInt());
	    try{
	        System.out.println(s.getArea());
	    	s.showInfo();
	    }catch(NotSanjiaoException N){
	    	System.out.println(N.getMessage());
	    }
	}
} 
class Sanj{
	int x,y,z;
	public Sanj(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	public double getArea() throws NotSanjiaoException{
		if(x+y<=z||x+z<=y||y+z<=x){
			throw new NotSanjiaoException("不能构成三角形");
		}
		double p=(x+y+z)/2;
		return Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}
	public void showInfo() throws NotSanjiaoException{
		System.out.println("三角形的三条边分别为："+x+" "+y+" "+z);
		if(x+y<=z|x+z<=y|y+z<=x){
			throw new NotSanjiaoException("不能构成三角形");
		}
	}
}
class NotSanjiaoException extends Exception{
	public NotSanjiaoException(String s) {
		super(s);
	}
}