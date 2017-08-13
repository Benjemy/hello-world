import java.util.*;
public class Student1 {
	public static void main(String[] args) {
		ArrayList<student> s=new ArrayList<student>();
		s.add(new student("张三","class1","java",85));
		s.add(new student("周乐儿","class1","c#",75));
		s.add(new student("周乐儿","class1","c#",75));
		s.add(new student("周乐儿","class1","java",75));
		HashSet<student> ha=new HashSet<student>();
		ha.addAll(s);
		ha.add(new student("李明","class2","Java",48));
		ha.add(new student("李明","class2","Java",48));
		Iterator<student> it=ha.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(int i=0;i<s.size();i++){
			student x=s.get(i);
			System.out.println(s.get(i));
		}
		int totalScore=0;
		int totalnum=0;
		for(int i=0;i<s.size();i++){
			if(s.get(i).getclass1().equals("class1"));
			totalScore+=s.get(i).getgrade();
			totalnum++;
		}
		System.out.println("class1班的总分="+totalScore/s.size());
		System.out.println("class1班的="+totalScore);
		int javaGrade=0,n1=0;
		int cGrade=0,n2=0;
		for(int i=0;i<s.size();i++){
			if(s.get(i).getproject().equals("java")){
			javaGrade+=s.get(i).getgrade();
			n1++;
			}
			if(s.get(i).getproject().equals("c#")){
			cGrade+=s.get(i).getgrade();
			n2++;
			}
		}
		System.out.println("class1班java的平均分="+javaGrade/n1);
		System.out.println("class1班c#的平均分="+cGrade/n2);
	}
 
}
class student{
	private String name;
	private String class1;
	private String project;
	private int grade;
	public student(String na,String cl,String pro,int gra) {
		name=na;
		class1=cl;
		project=pro;
		grade=gra;
	}
	public String getname(){
		return name;
	}
	public String getclass1(){
		return class1;
	}
	public String getproject(){
		return project;
	}
	public int getgrade(){
		return grade;
	}
	public String toString(){
		return name+","+class1+","+project+","+grade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((class1 == null) ? 0 : class1.hashCode());
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
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
		if (class1 == null) {
			if (other.class1 != null)
				return false;
		} else if (!class1.equals(other.class1))
			return false;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}
}