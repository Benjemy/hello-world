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
        fullPath = str; //全路径名
        pathSeparator = sep; //路径符
        extensionSeparator = ext; //扩展名符
    }
    public String extension() {    //取得扩展名 
    	int index=fullPath.indexOf(extensionSeparator);
    	return fullPath.substring(index+1);
    }
    public String filename() { //取得文件名
    	int index1=fullPath.lastIndexOf(pathSeparator);
    	int index2=fullPath.indexOf(extensionSeparator);
    	return fullPath.substring(index1+1,index2);
    }
    public String path() { //取得路径
    	int index3=fullPath.lastIndexOf(pathSeparator);
    	return fullPath.substring(index3+1);
    }
}