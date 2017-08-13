package a;

public class teacher extends person {
	private String subject;
	public teacher(String s,int age,String sub){
		super(s,age);
		this.subject=sub;
	}
	public String info(){
		return super.info()+"£¬"+"¿ÆÄ¿="+this.subject;
	}
}
