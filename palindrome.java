import java.util.Scanner;
class palindrome{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int r,sum=0;
		int n=s.nextInt();
		int temp;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
		
	}
}