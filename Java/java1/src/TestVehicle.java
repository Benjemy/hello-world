public class TestVehicle {
  public static void main(String[] args) {

    // Create a vehicle that can handle 10,000 kilograms weight
    System.out.println("Creating a vehicle with a 10,000kg maximum load.");
    Vehic vehicle = new Vehic(10000.0);

    // Add a few boxes
    System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500.0));
    System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250.0));
    System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000.0));
    System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000.0));
    System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300.0));

    // Print out the final vehicle load
    System.out.println("Vehicle load is " + vehicle.getLoad() + " kg");
  }
}
class Vehic{
	private double load;
	private double maxLoad;
	
	public Vehic(double max_Load){
		maxLoad=kiloToNewts(max_Load);
	}
	public boolean addBox(double weight){
		if(load+kiloToNewts(weight)>maxLoad){
			return false;
		}
		else {
			load+=kiloToNewts(weight);
			return load<maxLoad;
		}
	}
	public double getLoad(){
		return newtsToKilo(load);
	}
	public double getMaxLoad(){	
		return newtsToKilo(maxLoad);
	}
	private double kiloToNewts(double weight){
	      return (weight * 9.8);
	    }
    private double newtsToKilo(double weight){
	      return (weight / 9.8);
	    }
}