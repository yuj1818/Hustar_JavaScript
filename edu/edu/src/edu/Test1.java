package edu;

public class Test1 {

	public static void main(String[] args) {
		char c = '2';		//문자 1개
		String s = "문자열";	//문자 여러개
		int integer = 1;	//정수
		long lo = 100;		//정수
		double d = 1.211;	//실수
		boolean b = false;	//false,true
		
		int[] array = new int[3];		//정수형 배열(크기가 3)
		String[] text = new String[3];	//문자형 배열(크기가 3)
		
		//정사각형 모양
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//삼각형1
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//삼각형 반대로
		for (int i=0; i<5; i++) {
			for (int x = 0; x<i; x++) {
				System.out.print(" ");
			}
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
