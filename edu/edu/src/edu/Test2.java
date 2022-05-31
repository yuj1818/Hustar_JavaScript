package edu;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 값 입력 : ");
		
		String value = scan.next();
		
		System.out.println("문자 입력 값 : " + value);
		
		System.out.print("숫자 값 입력 : ");
		
		int integer = 0;
		
		while (true) {
			try {
				integer = scan.nextInt();
				System.out.println("숫자 입력 값 : " + integer);
				break;
			} catch(Exception e) {
				System.out.println("숫자만 입력하랬지");
				scan.next();
				System.out.print("숫자 값 입력 : ");
			}

		}
		
		
		scan.close();

	}

}
