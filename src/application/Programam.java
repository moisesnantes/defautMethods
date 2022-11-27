package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Programam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Mounths: ");
		int mounths = sc.nextInt();		
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, mounths);
		
		System.out.println("Payment after " + mounths + " months");
		System.out.println(String.format("%2.f", payment));

	}

}
