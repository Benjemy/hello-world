interface shape{
	public  static final double PI=3.14;
	public abstract double area();
	public abstract double perimeter();
 
}
class Circle implements shape{
	private int r;
    
	 public Circle(int r) {
		this.r = r;
		System.out.println("��Ϊ"+r+"��Բ�ѹ���");
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
		System.out.println("��Ϊ"+l+"��Ϊ"+w+"�������ѹ���");
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
		 System.out.println("�����="+totalarea);			 
		 System.out.println("���ܳ�="+totalperimeter);	
	}
}