package a;

public class student extends person {
	private int sno;
	public student(String s, int age, int num) {
		super(s, age);
		this.sno=num;
	}
	public String info(){
		return super.info()+"£¬"+"Ñ§ºÅ="+this.sno;
	}
}
