
public class Cat extends Animal implements Pet{
	public String name;
	public Cat(String name) {
		super(2);
		this.name=name;
	}
	public Cat(){
		this("");
	}
	public void eat() {
		 
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void play() {
		 System.out.println(this.name+" likes to play with string.");
	}

	public void setName(String name) {
		 this.name=name;
	}

}
