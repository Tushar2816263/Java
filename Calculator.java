import java.util.Scanner;

public class Calculator {
	
	
	ClsInput input = new ClsInput();
//	Scann
	Scanner scn = new Scanner(System.in);
	
	public void add() {
		int a,b,c;
		a = input.getInput();
		b = input.getInput();
		c = a + b;
		System.out.println(c);
	}
	
public void Sub() {
	int a,b,c;
	a = input.getInput();
	b = input.getInput();
	c = a - b;
	System.out.println(c);
		
	}

public void Mul() {
	int a,b,c;
	a = input.getInput();
	b = input.getInput();
	c = a * b;
	System.out.println(c);
}

public void Div() {
	int a,b,c;
	a = input.getInput();
	b = input.getInput();
	c = a / b;
	System.out.println(c);
}
	
	

}
