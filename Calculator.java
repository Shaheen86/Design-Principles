import java.util.*;
public class Calculator{
	
	public static int add(int x,int y){
		return(x+y);
	}
	public static int subtract(int x,int y){
		return(x-y);
	}
	public static int mult(int x,int y){
		return(x*y);
	}
	public static int div(int x,int y){
		return x/y;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		Calculator obj=new MainCalculator();
		int x=sc.nextInt();
		char operator = sc.next().charAt(0);
		int b = sc.nextInt();
		if(operator=='+'){
			System.out.print("Addition of "+x+" and "+y+" is ");
			System.out.println(obj.addition(x,y));
		}
		if(operator=='-'){
			System.out.print("Subtraction of "+x+" and "+y+" is ");
			System.out.println(obj.subtraction(x,y));
		}
		if(operator=='*'){
			System.out.print("Multiplication of "+x+" and "+y +" is ");
			System.out.println(obj.multiplication(x,y));
		}
		if(operator=='/'){
			System.out.print("Division of "+x+" and "+y+" is ");
			System.out.println(obj.division(x,y));
		}
	}
}