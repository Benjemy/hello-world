import java.io.*;
public class test6 {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf=new RandomAccessFile("e://d.txt","rw");
		    for(int i=0;i<10;i++)
		    	raf.writeInt(i);
		    raf.seek(4);
		    raf.writeInt(100);
		    //指向文件头
		    raf.seek(0);
		    for(long k=0;k<raf.length();k=raf.getFilePointer())
		    	System.out.println(raf.readInt());
		    raf.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}