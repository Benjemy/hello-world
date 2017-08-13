import java.io.*;
public class test4 {
	public static void main(String[] args) {
		try{
			RandomAccessFile raf=new RandomAccessFile("d:\\B.txt","rw");
			for(double i=1;i<=10;i++){
				raf.writeDouble(i);
			}
			raf.seek(24);
			raf.writeDouble(95.5);
			for(long i=raf.length();i>=32;i=i-8){
				raf.seek(i-8);
				double tmp = raf.readDouble();
				raf.seek(i);
				raf.writeDouble(tmp);
			}
			raf.seek(32);
			raf.writeDouble(95.5);
			raf.seek(0);
			for(long i=0;i<raf.length();i=raf.getFilePointer());
			System.out.println(raf.readDouble());
			raf.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
