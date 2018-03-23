package baitap2;

import java.util.Scanner;

public class bai2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" inch input");
	 double inch;
	 inch = sc.nextDouble();
	 double result = inch * 0.0254;
	 System.out.println(inch + " = " + result+"metter");
}
}
