import java.util.Scanner;
public class ceshi {

	/**
	 * @param args*/
	 
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     int w = sc.nextInt();
	     int n;
	     System.out.println("������һ�����֣�");
	     n=w-1;
	     System.out.print("����������");
	     switch(n%7){
	     case 0:
	    	 System.out.println("��");break;
	     case 1:
	    	 System.out.println("һ");break; 
	     case 2:
	    	 System.out.println("��");break;
	     case 3:
	    	 System.out.println("��");break;
	     case 4:
	    	 System.out.println("��");break;
	     case 5:
	    	 System.out.println("��");break;
	     case 6:
	    	 System.out.println("��");break;
	     }
	     n=w+1;
	        System.out.print("����������");
	        switch (n % 7) {
	        case 0:
	            System.out.println("��"); break;
	        case 1:
	            System.out.println("һ"); break;
	        case 2:
	            System.out.println("��");break;
	        case 3:
	            System.out.println("��");break;
	        case 4:
	            System.out.println("��"); break;
	        case 5:
	            System.out.println("��");break;
	        case 6:
	            System.out.println("��");break;
	            }
		}

}