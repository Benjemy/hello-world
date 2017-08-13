
public class testpoint1 {
 
	public static void main(String[] args) {
		 point1 p1=new point1(1,2);
		 point1 p2=new point1(3,4);
		 System.out.println(p1);
		 System.out.println(p2);
	}

}
class point1{
	private double x;
	private double y;
	public point1(double x, double y) {
		this.x = x;
		this.y = y;
	}
    public String toString() {
    	return super.toString();
    }
}