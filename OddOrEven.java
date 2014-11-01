package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		int num=Integer.parseInt(br.readLine());
		String res=determineOddEven(num);
		System.out.println(res);
	}
	
	public static String determineOddEven(int n) {
		if(n%2==0)
			return "Even";
		else
			return "Odd";
	}
}
