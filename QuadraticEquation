package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Accepting input
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Equation of form: ax^2 + bx + c = 0");
		
		System.out.print("Enter coefficient of x^2: ");
		float a=Integer.parseInt(br.readLine());			
		
		System.out.print("Enter coefficient of x^1: ");
		float b=Integer.parseInt(br.readLine());
		
		System.out.print("Enter 'c': ");
		float c=Integer.parseInt(br.readLine());
		
		roots(a, b, c);		
	}
	
	public static void roots(float a, float b, float c) {
		float twoA=2*a;
		float determinantWithoutRoot=(b*b)-(4*a*c);
		float determinant=(float)Math.sqrt(determinantWithoutRoot);
		float plus=(-b+determinant)/twoA;
		float minus=(-b-determinant)/twoA;
		System.out.println("Roots are: "+plus+"\n"+minus);
	}
}
