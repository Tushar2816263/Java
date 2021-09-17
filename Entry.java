import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
				
		int ch = scn.nextInt();
		
		switch(ch)
		{
		   case 1:
			   System.out.println("You are in addition case");
			   calc.add();
			   break;
			   
		   case 2:
			   System.out.println("You are in subtraction case");
			   calc.Sub();
			   break;
			   
		   case 3:
			   System.out.println("You are in multiplication case");
			   calc.Mul();
			   break;
			   
		   case 4:
			   System.out.println("You are in Division case");
			   calc.Div();
			   break;
			   
			   default:
				   System.out.println("invalid input");
		}
		}

	}

}
