package a;

public class person {
private String paname;
private int age;
public person(String s,int age){
	paname=s;
	this.age=age;
}
public String info(){
	return "����="+paname+"��"+"����="+this.age;
}
}
