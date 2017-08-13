
public class testpoint {
	public static void main(String[] args) {
		point p1=new point();
		p1.printpoint();
	}

}
class point{
	private int x;
	private int y;
	public void printpoint(){
		System.out.println("("+x+","+y+")");
	}
	public double distance(){
		return Math.sqrt(x*x+y*y);
	}
}