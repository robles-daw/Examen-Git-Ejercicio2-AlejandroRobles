package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Dame un lado");
		double lado=input.nextDouble();
		System.out.println((Math.pow(lado, 2)));
		
		input.close();

	}

}
