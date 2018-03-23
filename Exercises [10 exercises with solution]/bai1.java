package baitap2;

import java.util.Scanner;

public class bai1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("input fahreneit :");
	double f = input.nextInt();
	double kq = ((5*(f-32)/9));
	System.out.println(f+"fahreneit is equal to:" + kq );
	
}
}
