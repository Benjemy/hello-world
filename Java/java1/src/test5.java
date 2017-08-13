import java.io.*;
public class test5 {
	public static void main(String[] args) {
		try{
			FileOutputStream fo=new FileOutputStream("d:\\test.txt",true);
		    OutputStreamWriter ot=new OutputStreamWriter(fo);
			ot.write("HelloWorld");
			ot.flush();
			FileInputStream fi=new FileInputStream("d:\\test.txt");
			byte b[]=new byte[100];
			int lb=fi.read(b);
			for(int i=0;i<lb;i++){
				System.out.print((char)b[i]);
			}
			fo.close();
			ot.close();
			fi.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
