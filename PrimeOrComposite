package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrComposite {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Accepting input
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		int num=Integer.parseInt(br.readLine());
		String res=determinePrimeComposite(num);
		System.out.println(res);
	}
	
	public static String determinePrimeComposite(int n) {
		int counter=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				counter++;
		}
		if(counter!=0)
			return "Composite";
		else
			return "Prime";
	}
}
