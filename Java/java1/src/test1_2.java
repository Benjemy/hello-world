import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test1_2{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("d://f.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String str;
			while(true){
				str = sc.nextLine();
				if(str.equals("exit")) break;
				else{
				bw.write(str);
				bw.newLine();}
			}
			bw.flush();
		fw.close();
		bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		
		

	}

}
