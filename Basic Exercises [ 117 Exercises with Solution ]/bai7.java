package batap;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number : 8");
		int a = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"x"+i+"="+(a*i));
		}
	}

}
