import java.util.Scanner;
public class ceshi {

	/**
	 * @param args*/
	 
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     int w = sc.nextInt();
	     int n;
	     System.out.println("请输入一个数字：");
	     n=w-1;
	     System.out.print("昨天是星期");
	     switch(n%7){
	     case 0:
	    	 System.out.println("日");break;
	     case 1:
	    	 System.out.println("一");break; 
	     case 2:
	    	 System.out.println("二");break;
	     case 3:
	    	 System.out.println("三");break;
	     case 4:
	    	 System.out.println("四");break;
	     case 5:
	    	 System.out.println("五");break;
	     case 6:
	    	 System.out.println("六");break;
	     }
	     n=w+1;
	        System.out.print("明天是星期");
	        switch (n % 7) {
	        case 0:
	            System.out.println("日"); break;
	        case 1:
	            System.out.println("一"); break;
	        case 2:
	            System.out.println("二");break;
	        case 3:
	            System.out.println("三");break;
	        case 4:
	            System.out.println("四"); break;
	        case 5:
	            System.out.println("五");break;
	        case 6:
	            System.out.println("六");break;
	            }
		}

}