import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert any number");
		int n=sc.nextInt();
		boolean isprime= true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println(n+"is prime number");
		}
		else {
			System.out.println(n+"is Not prime numer");
		}

	}

}
