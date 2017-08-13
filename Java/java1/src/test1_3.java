import java.util.*;
public class test1_3 {
	public static void main(String[] args) {
		ArrayList<point> al=new ArrayList<point>();
		al.add(new point(1,1));
		al.add(new point(1,2));
		al.add(new point(3,2));
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).toString());
		}
	}

}
class point{
	private double x;
	private double y;
	public point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}