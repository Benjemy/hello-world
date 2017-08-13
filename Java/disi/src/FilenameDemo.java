public class FilenameDemo {                               // FilenameDemo.java
    public static void main(String[] args) {
        Filename myHomePage = new Filename("/home/mem/index.html",'/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}
class Filename {                                    // Filename.java
    private String fullPath;
    private char pathSeparator, extensionSeparator;
    public Filename(String str, char sep, char ext) {
        fullPath = str; //ȫ·����
        pathSeparator = sep; //·����
        extensionSeparator = ext; //��չ����
    }
    public String extension() {    //ȡ����չ�� 
    	int index=fullPath.indexOf(extensionSeparator);
    	return fullPath.substring(index+1);
    }
    public String filename() { //ȡ���ļ���
    	int index1=fullPath.lastIndexOf(pathSeparator);
    	int index2=fullPath.indexOf(extensionSeparator);
    	return fullPath.substring(index1+1,index2);
    }
    public String path() { //ȡ��·��
    	int index3=fullPath.lastIndexOf(pathSeparator);
    	return fullPath.substring(index3+1);
    }
}