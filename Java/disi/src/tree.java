
public class tree {
 
	public static void main(String[] args) {
		ages a= new ages();
		 System.out.println(a.ages());
	}

}
class ages{
	public int ages;
	public int year;
	public int ages(){
		return ages+year;
	}
}