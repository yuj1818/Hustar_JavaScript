package edu.Lecture1;

import java.util.Scanner;

/**
 * �ۼ���: ������
 * �ۼ���: 2022-05-30
 * ����: �ܼ� ���� ���α׷�(����)
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
		
		System.out.print("���� �Է� : ");
		firstValue = scan.nextInt();
		
		while(mark.equals("=") == false) {
			System.out.println("");
			System.out.print("��� ��ȣ �Է�: ");
			mark = scan.next();
			
			if (mark.equals("+") || mark.equals("-") || mark.equals("*") || mark.equals("/")) {
				System.out.println("");
				System.out.print("���� �Է� : ");
				secondValue = scan.nextInt();
			} else if (mark.equals("=")){
				break;
			} else {
				System.out.println("");
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
			}
			
			if (mark.equals("+")) {
				firstValue += secondValue;
			} else if(mark.equals("-")) {
				firstValue -= secondValue;
			} else if(mark.equals("*")) {
				firstValue *= secondValue;
			} else if(mark.equals("/")) {
				firstValue /= secondValue;
			}
		}
		
		System.out.println("");
		System.out.print("��� ��� : " + firstValue);
		
		scan.close();
	}

}