package myClass;

import java.util.Scanner;

public class guideProgram {

	
	public static void main(String args[]){
		System.out.println("��������Ŀ��ֱ��r��Ŀ�����h���м��ÿո����������Ϊ�����㲢�ṩ����");
		Scanner in=new Scanner(System.in);
		double r=in.nextDouble();
		double h=in.nextDouble();
		System.out.println("����ѡ������͹̨�߶Ȼ��������������Ա��ڳ������ó�����");
		System.out.println("����ѡ������͹̨�߶ȣ�������1��ѡ������������������2��");
		Scanner in1=new Scanner(System.in);
		
		int choose=in1.nextInt();
		if(choose==1){
			verifyProgram.guidetest(choose,r,h);

		}else if(choose==2){
			verifyProgram.guidetest(choose,r,h);
		}else{
			System.out.println("��������ȷ��ѡ��");
			System.out.println("��������ѡ��,����͹̨�߶ȣ�������1��ѡ������������������2��");
			Scanner in2=new Scanner(System.in);
			verifyProgram.guidetest(in2.nextInt(),r,h);
		}
	}
}
