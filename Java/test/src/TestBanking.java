import banking.*;

public class TestBanking {

  public static void main(String[] args) {
    Bank     bank = new Bank(6);

    bank.addCustomer("Jane", "Simms");
    bank.addCustomer("Owen", "Bryant");
    bank.addCustomer("Tim", "Soley");
    bank.addCustomer("Maria", "Soley");

    for ( int i = 0; i < bank.getNumOfCustomer(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("Customer [" + (i+1) + "] is "
			 + customer.getLastName()
			 + ", " + customer.getFirstName());
    }
  }
}