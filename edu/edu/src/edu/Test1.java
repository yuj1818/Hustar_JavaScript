package edu;

public class Test1 {

	public static void main(String[] args) {
		char c = '2';		//���� 1��
		String s = "���ڿ�";	//���� ������
		int integer = 1;	//����
		long lo = 100;		//����
		double d = 1.211;	//�Ǽ�
		boolean b = false;	//false,true
		
		int[] array = new int[3];		//������ �迭(ũ�Ⱑ 3)
		String[] text = new String[3];	//������ �迭(ũ�Ⱑ 3)
		
		//���簢�� ���
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//�ﰢ��1
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//�ﰢ�� �ݴ��
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