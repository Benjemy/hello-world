
public class testString {
	public static void main(String[] args) {
		  int a=10;        
		  int b=0;
		  int c[]={1,2,3};
		  try{
			  System.out.println(c[3]);
			  System.out.println(a/b);
		  }catch(Exception e){
			  System.out.println("����Ϊ��");
			  System.out.println("�±�Խ��");
			  System.out.println(e);
			  System.out.println(e.getMessage());
			  e.printStackTrace();
		  }
	}

}
