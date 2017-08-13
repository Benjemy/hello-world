
public abstract class Animal {
	protected int legs;
	public abstract void eat();
	protected Animal(int legs){
		this.legs=legs;
	}
	public void walk(){
		System.out.println("this animal walks on "+this.legs+" legs.");
	}
}
