package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Dame un radio");
		double radio=input.nextDouble();
		System.out.println((Math.PI*Math.pow(radio, 2)));
		
		input.close();

	}

}
