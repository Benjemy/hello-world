import java.io.*;
import java.util.*;
public class test2_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			FileWriter fw=new FileWriter("d:\\b.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while(true){
				String st=sc.nextLine();
				if(sc.equals("exit")){
					break;
				}
				else{
					bw.write(st);
					bw.newLine();
				}
			}
			bw.flush();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}	
