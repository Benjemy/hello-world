import java.io.*;
import java.util.Scanner;

//ʹ���ַ���BufferedReader��BufferedWriter�࣬ʵ�ֽ�2���ļ��ϲ���һ���ļ����ļ����ɿ���̨���롣
public class test9 {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("�����ļ�1��");
			FileReader fr1=new FileReader(sc.next());
			BufferedReader br1=new BufferedReader(fr1);
			System.out.print("�����ļ�2��");
			FileReader fr2=new FileReader(sc.next());
			BufferedReader br2=new BufferedReader(fr2);
			System.out.print("����ϲ����ļ���");
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
			System.out.println("����ɹ�");
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