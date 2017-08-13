interface shape{
	public  static final double PI=3.14;
	public abstract double area();
	public abstract double perimeter();
 
}
class Circle implements shape{
	private int r;
    
	 public Circle(int r) {
		this.r = r;
		System.out.println("长为"+r+"的圆已构建");
	}

	public double area() {
		 
		return 3.14*r*r;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}
}
class Rectangle implements shape{
	private int l;
	private int w;
	 
	public Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
		System.out.println("长为"+l+"宽为"+w+"长方形已构建");
	}
	public double area() {
		// TODO Auto-generated method stub
		return l*w;
	}
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(l+w);
	}

}
public class testshape {
	public static void main(String[] args) {
		 shape s[]={new Circle(1),new Circle(2),
				    new Rectangle(3,4),new Rectangle(5,6)};
		 double totalarea=0,totalperimeter=0;
		 for(int i=0;i<s.length;i++){
			 totalarea+=s[i].area();
		     totalperimeter+=s[i].perimeter();
	     }
		 System.out.println("总面积="+totalarea);			 
		 System.out.println("总周长="+totalperimeter);	
	}
}