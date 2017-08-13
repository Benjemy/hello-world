import java.util.*;
public class testWorker {
	public static void main(String[] args) {
		ArrayList<worker> wor=new ArrayList<worker>();
		wor.add(new worker(1001,"Tom","Market",1200));
		wor.add(new worker(1002,"Jack","department",1300));
		wor.add(new worker(1003,"Simth","Market",2000));
		wor.add(new worker(1004,"Tony","department",3000));
	}

}
class worker{
	private int num;
	private String name;
	private String department;
	private int salary;
	public worker(int n,String na,String depart,int sa) {
		num=n;
		name=na;
		department=depart;
		salary=sa;
	}
	public int getNum(){
		return num;
	}
	public String getName(){
		return name;
	}
	public String getDepartment(){
		return department;
	}
	public int getSalary(){
		return salary;
	}
}