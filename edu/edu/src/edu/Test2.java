package edu;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		
		String value = scan.next();
		
		System.out.println("���� �Է� �� : " + value);
		
		System.out.print("���� �� �Է� : ");
		
		int integer = 0;
		
		while (true) {
			try {
				integer = scan.nextInt();
				System.out.println("���� �Է� �� : " + integer);
				break;
			} catch(Exception e) {
				System.out.println("���ڸ� �Է��Ϸ���");
				scan.next();
				System.out.print("���� �� �Է� : ");
			}

		}
		
		
		scan.close();

	}

}