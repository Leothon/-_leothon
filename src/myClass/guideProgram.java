package myClass;

import java.util.Scanner;

public class guideProgram {

	
	public static void main(String args[]){
		System.out.println("请您输入目标直径r和目标深度h，中间用空格隔开，程序将为您计算并提供建议");
		Scanner in=new Scanner(System.in);
		double r=in.nextDouble();
		double h=in.nextDouble();
		System.out.println("请您选择输入凸台高度或者输入余量，以便于程序计算得出建议");
		System.out.println("若您选择输入凸台高度，请输入1；选择输入余量，请输入2；");
		Scanner in1=new Scanner(System.in);
		
		int choose=in1.nextInt();
		if(choose==1){
			verifyProgram.guidetest(choose,r,h);

		}else if(choose==2){
			verifyProgram.guidetest(choose,r,h);
		}else{
			System.out.println("请输入正确的选择");
			System.out.println("请您重新选择,输入凸台高度，请输入1；选择输入余量，请输入2；");
			Scanner in2=new Scanner(System.in);
			verifyProgram.guidetest(in2.nextInt(),r,h);
		}
	}
}
