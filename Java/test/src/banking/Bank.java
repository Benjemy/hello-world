package banking;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	public Bank(int length){
		if(length<5){
			System.out.println("最大长度可以大于5");
		}
		customers=new Customer[length];
		this.numberOfCustomers=0;
	}
	public void addCustomer(String f,String l){
		Customer cus=new Customer(f,l);
		customers[this.numberOfCustomers++]=cus;
	}
	public int getNumOfCustomer(){
		return this.numberOfCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}
}
 