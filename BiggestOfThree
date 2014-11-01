package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestOfThree {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Accepting input
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

		System.out.print("Enter 1st number: ");
		int n1=Integer.parseInt(br.readLine());			
		
		System.out.print("Enter 2nd number: ");
		int n2=Integer.parseInt(br.readLine());
		
		System.out.print("Enter 3rd number: ");
		int n3=Integer.parseInt(br.readLine());
		
		int biggest=determineBiggest(n1, n2, n3);
		System.out.println("Biggest number: "+biggest);
	}
	
	public static int determineBiggest(int n1, int n2, int n3) {
		if(n1>n2&&n1>n3)
			return n1;
		else if(n2>n3)
			return n2;
		else
			return n3;
	}
}
