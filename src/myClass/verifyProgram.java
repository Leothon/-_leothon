package myClass;

import java.util.Scanner;

public class verifyProgram {

	//��������Ŀ�����h��Ŀ��뾶r����ֱ��d1�������ֱ��d2��͹̨�߶�b
	
	
	public static  void guidetest(int i,double o,double p){
		if(i==2){
			//y<=tan(arc tan(r/h))(4+2b)
			Scanner inp=new Scanner(System.in);
			double y=inp.nextDouble();
			double q=Math.toDegrees(Math.atan(o/p));
			double w=Math.tan(Math.toRadians(q));
			double b=y/(2*w)-2;
			System.out.println("������Ϊ"+y+"ʱ��͹̨�߶�bӦ�ô��ڻ��ߵ���"+b+",���ܷ��ϱ�׼��");
		}else if(i==1){
			Scanner inu=new Scanner(System.in);
			double b=inu.nextDouble();
			double e=Math.toDegrees(Math.atan(o/p));
			double t=Math.tan(Math.toRadians(e));
			double y=t*(4+2*b);
			System.out.println("��͹̨�߶�Ϊ"+b+"ʱ������yӦ��С�ڻ��ߵ���"+y+",���ܷ��ϱ�׼��");
		}
	}
	
	public static void main(String args[]){
		
		System.out.println("�����������룺Ŀ�����h��Ŀ��뾶r����ֱ��d1�������ֱ��d2��͹̨�߶�b���������м��ɿո����������Ϊ����֤");
		Scanner input=new Scanner(System.in);
		
		double a=2;//������
		double h=input.nextFloat();
		double r=input.nextFloat();
		double d1=input.nextFloat();
		double d2=input.nextFloat();
		double b=input.nextFloat();
		
		
		double z=a+b;
		double y=d2-d1;//��ʾ����
		
		double x=z*y;
		double ��=Math.toDegrees(Math.atan(r/h));
		double ��=Math.toDegrees(Math.atan(x/2));
		

		if(��>��){
			//do something
			System.out.println("�������������벻��׼ȷ��λ�����ڣ��밴������Ҫ����������");
			System.out.println("���ݳ�����㣬������͹̨�߶ȳ����ȣ���ѡȡ�ʵ���͹̨�߶�֮���ó������ó����ʵ���������ѡȡ�ʵ��������ó���ó����ʵ�͹̨�߶�");
			System.out.println("����ѡ������͹̨�߶ȣ�������1��ѡ������������������2��");
			Scanner in=new Scanner(System.in);
			
			int choose=in.nextInt();
			if(choose==1&&choose==2){
				guidetest(choose,r,h);
			}else{
				System.out.println("��������ȷ��ѡ��");
				System.out.println("��������ѡ��,����͹̨�߶ȣ�������1��ѡ������������������2��");
				Scanner in2=new Scanner(System.in);
				guidetest(in2.nextInt(),r,h);
			}
			
		}else if(��<��){
			//do something
			System.out.println("������������");
		}else{
			System.out.println("��ʱ���ڼ���λ�ã��������");
			System.out.println("��������ѡ������,͹̨�߶ȣ�������1��ѡ������������������2��");
			Scanner in3=new Scanner(System.in);
			guidetest(in3.nextInt(),r,h);
			
		}
		
	}
	
}
