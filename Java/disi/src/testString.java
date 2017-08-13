
public class testString {
	public static void main(String[] args) {
		  int a=10;        
		  int b=0;
		  int c[]={1,2,3};
		  try{
			  System.out.println(c[3]);
			  System.out.println(a/b);
		  }catch(Exception e){
			  System.out.println("除数为零");
			  System.out.println("下标越界");
			  System.out.println(e);
			  System.out.println(e.getMessage());
			  e.printStackTrace();
		  }
	}

}
