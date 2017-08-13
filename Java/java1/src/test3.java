import java.io.*;
public class test3 {
	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("d:\\a.txt");
			BufferedReader br=new BufferedReader(fr);
			
			FileWriter fw=new FileWriter("d:\\c.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			int num=1;
			String str;
			while(true){
				str=br.readLine();
				if(str==null){
					break;
				}
				else{
					bw.write(num+":"+str);
					bw.newLine();
					num++;
				}
			}
			bw.flush();
			fr.close();
			br.close();
			bw.close();
			fw.close();
		}catch(IOException e){
			System.out.print(e);
		}
	}

}
