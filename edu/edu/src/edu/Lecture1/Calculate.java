package edu.Lecture1;

import java.util.Scanner;

/**
 * 작성자: 손유정
 * 작성일: 2022-05-30
 * 내용: 콘솔 계산기 프로그램(메인)
 */

public class Calculate {

	public static void main(String[] args) {
		//x = 2 + 3 - 5 + 3
		//= 5 - 5 + 3
		//= 0 + 3
		//= 3 
		int firstValue = 0;
		int secondValue = 0;
		String mark = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		firstValue = scan.nextInt();
		
		while(mark.equals("=") == false) {
			System.out.println("");
			System.out.print("계산 기호 입력: ");
			mark = scan.next();
			
			if (mark.equals("+") || mark.equals("-") || mark.equals("*") || mark.equals("/")) {
				System.out.println("");
				System.out.print("숫자 입력 : ");
				secondValue = scan.nextInt();
			} else if (mark.equals("=")){
				break;
			} else {
				System.out.println("");
				System.out.println("올바른 기호를 입력하세요");
			}
			
			/*if (mark.equals("+")) {
				firstValue += secondValue;
			} else if(mark.equals("-")) {
				firstValue -= secondValue;
			} else if(mark.equals("*")) {
				firstValue *= secondValue;
			} else if(mark.equals("/")) {
				firstValue /= secondValue;
			}*/
			
			CalFunction cf = new CalFunction();
			firstValue = cf.calFunction(firstValue, secondValue, mark);
		}
		
		System.out.println("");
		System.out.print("계산 결과 : " + firstValue);
		
		scan.close();
	}

}
