//import java.util.Scanner;
import java.util.*;
public class disi {
 
	public static void main(String[] args) {
         int a[][]={
        		 {32,87,90},{-4,6},{77,15,100,-23},
        		 {5,-4,77}
        };
         System.out.println("第一小题：");
         for(int i=0;i<a.length;i++){
        	 for(int j=0;j<a[i].length;j++)
        		 System.out.print(a[i][j]+" ");
        	 System.out.println();
        	      
         }
         System.out.println("第二小题:");
         for(int i=0;i<a.length;i++)
        	 for(int j=0;j<a[i].length;j++)
        		 if(a[i][j]==-4)
        	    	 System.out.print("("+i+","+j+")"+" ");
         System.out.println();
         System.out.println("第三小题：");
         for(int i=0;i<a.length;i++)
        	 for(int j=0;j<a[i].length;j++)
        		 if(a[i][j]==-4){
        			 System.out.println("("+i+","+j+")"+" ");
        			 i=a.length;
        			 break;
        		 }
         System.out.println("第四小题：");
         for(int i=0;i<a.length;i++){
        	 Arrays.sort(a[i]);
        	 for(int j=0;j<a[i].length;j++)
        		 System.out.print(a[i][j]+" ");
        	 System.out.println();
         }
        		 
	
	}
}
