import java.io.*;
public class test1_1 {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf=new RandomAccessFile("d://e.txt","rw");
		    for(int i=0;i<10;i++)
		    	raf.writeInt(i);
		    for(int j=(int) raf.length();j>16;j-=4){
		    	raf.seek(j-4);
		    	int tem=raf.readInt();
		    	raf.seek(j);
		    	raf.writeInt(tem);
		    }
		    raf.seek(16);
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
