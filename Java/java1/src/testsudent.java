import a.*;
public class testsudent {
	public static void main(String[] args) {
		person p[]=new person[3];
		p[0]=new person("tom",40);
		p[1]=new student("mary",15,1001);
		p[2]=new teacher("San",35,"SE");
		for(int i=0;i<p.length;i++){
			System.out.println(p[i].info());
		}

	}

}
