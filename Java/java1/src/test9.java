import java.io.*;
import java.util.Scanner;

//使用字符流BufferedReader和BufferedWriter类，实现将2个文件合并成一个文件，文件名由控制台输入。
public class test9 {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("输入文件1：");
			FileReader fr1=new FileReader(sc.next());
			BufferedReader br1=new BufferedReader(fr1);
			System.out.print("输入文件2：");
			FileReader fr2=new FileReader(sc.next());
			BufferedReader br2=new BufferedReader(fr2);
			System.out.print("输入合并后文件：");
			FileWriter fw=new FileWriter(sc.next());
			BufferedWriter bw=new BufferedWriter(fw);
			
			String str;
			while(true){
				str=br1.readLine();
				if(str==null){
					break;
				}else{
					bw.write(str);
					bw.newLine();
				}
			}
			while(true){
				str=br2.readLine();
				if(str==null){
					break;
				}else{
					bw.write(str);
					bw.newLine();
				}
			}
			bw.flush();
			System.out.println("输出成功");
			fr1.close();
			br1.close();
			fr2.close();
			br2.close();
			fw.close();
			bw.close();
		} catch(IOException e){
			System.out.println("IOException:"+e.getMessage());
		}
	}

}