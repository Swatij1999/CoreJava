  import java.util.Scanner;

class pelendrom{
 
public static void main(String arg[]){
	System.out.println("enter num value");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int digit=0;
	int rev=0;
	int temp=num;
	
	while(num>0){
		digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	if(temp==rev){
		System.out.println("pelendrom");
	}
	else{
		System.out.println("not pelendrom");
	}
}
}