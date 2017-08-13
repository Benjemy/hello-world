
public class Fish extends Animal implements Pet{

	protected Fish() {
		super(0);
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}
	public void walk(){
		System.out.println("This animal walks on 0 legs.");
		System.out.println("Fis,of course,can't walk;they swim.");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void play() {
		 System.out.println("Fish swim in their tanks all day.");
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

}
