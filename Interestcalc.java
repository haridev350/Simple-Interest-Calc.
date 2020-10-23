import java.util.Scanner;
public class Interestcalc {

	public static void main(String[] args) {
      int time,rate,principal,d;
      Scanner sc = new Scanner(System.in);
     System.out.println("Welcome to Simple Interest Calc");
     System.out.println("Enter the principal amount:");
     principal = sc.nextInt();
     System.out.println("Enter the rate of interest:");
     rate = sc.nextInt();
     System.out.println("Enter the time period (in years):");
     time = sc.nextInt();
     d = principal*rate*time/100;
     System.out.println("The Simple Interest is :" + d);
     sc.close();
     
     
    
	}

}
