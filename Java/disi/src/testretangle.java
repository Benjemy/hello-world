
public class testretangle {
	public static void main(String[] args) {
		rectangle r= new rectangle();
		r.length=9;
		r.width=4;
		System.out.println(r.perimeter());
		System.out.println(r.area());
	}
}
class rectangle{
	public int length;
	public int width;
	public int perimeter(){
		return 2*(length+width);
	}
	public int area(){
		return length*width;
	}
}