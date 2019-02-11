import java.util.Scanner;
public class table{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number whose table to print");
		int j;
		int n=scan.nextInt();
		for(int i=1; i<=10 ;i++){
			j=i*n;
			System.out.println(j);
			
		}
	}
}