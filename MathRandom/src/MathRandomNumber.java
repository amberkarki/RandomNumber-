import java.util.Scanner;

public class MathRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=(int)(Math.random()*101);// only once this will be generate a random number to match to user inputed userNumber.
		System.out.println("\n Guess a Number between 0 and 100" );
		System.out.println("-----------------------------------");
		int userNumber=-1;// declaring userNumber as initial value -1 to test before  wile loop start 
		//  we can do this another  way using boolean found=false to   satisfy this while loop.
		while(userNumber!=number)
		{
			System.out.println("\n Enter Your  Guess Number :"); //Taking user input
			userNumber=input.nextInt();
			if(userNumber==number)
			{
				System.out.println(" Your Guess is Correct  and The Number is : "+ number);
			}
			else if(userNumber>number)
			{
				System.out.println(" Your Guess is  too high ");
			}
			else 
			{
				System.out.println(" Your Guess is  too low ");
			}
		}
		
			
input.close();
	}

}
