import java.util.*;
public class testStudent {
	public static void main(String[] args) {
		ArrayList<student> st=new ArrayList<student>();
		HashSet<student> ha=new HashSet<student>();
		st.add(new student(1,"Tom",20));
		st.add(new student(2,"Jack",21));
		st.add(new student(3,"John",22));
		st.add(new student(4,"Tom",20));
		st.add(new student(5,"John",22));
		ha.addAll(st);
		Iterator<student> it=ha.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

}
class student{
	private int num;
	private String name;
	private int age;
	public student(int n,String na,int a) {
		num=n;
		name=na;
		age=a;
	}
	public int Num(){
		return num;
	}
	public String Name(){
		return name;
	}
	public int Age(){
		return age;
	}
	public String toString(){
		return "sid:"+num+",name:"+name+",age"+age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}