import java.util.Scanner;
public class shuzi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<0||n>100){
			System.out.println("«Î÷ÿ–¬ ‰»Î£∫");
			n=sc.nextInt();
		}
		
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
        System.out.println("0+1+2...+"+n+"="+sum);
	}
	

}
