package myClass;

import java.util.Scanner;

public class verifyProgram {

	//依次输入目标深度h，目标半径r，针直径d1，导板孔直径d2，凸台高度b
	
	
	public static  void guidetest(int i,double o,double p){
		if(i==2){
			//y<=tan(arc tan(r/h))(4+2b)
			Scanner inp=new Scanner(System.in);
			double y=inp.nextDouble();
			double q=Math.toDegrees(Math.atan(o/p));
			double w=Math.tan(Math.toRadians(q));
			double b=y/(2*w)-2;
			System.out.println("当余量为"+y+"时，凸台高度b应该大于或者等于"+b+",才能符合标准！");
		}else if(i==1){
			Scanner inu=new Scanner(System.in);
			double b=inu.nextDouble();
			double e=Math.toDegrees(Math.atan(o/p));
			double t=Math.tan(Math.toRadians(e));
			double y=t*(4+2*b);
			System.out.println("当凸台高度为"+b+"时，余量y应该小于或者等于"+y+",才能符合标准！");
		}
	}
	
	public static void main(String args[]){
		
		System.out.println("请您依次输入：目标深度h，目标半径r，针直径d1，导板孔直径d2，凸台高度b，两数字中间由空格隔开，程序将为您验证");
		Scanner input=new Scanner(System.in);
		
		double a=2;//导板厚度
		double h=input.nextFloat();
		double r=input.nextFloat();
		double d1=input.nextFloat();
		double d2=input.nextFloat();
		double b=input.nextFloat();
		
		
		double z=a+b;
		double y=d2-d1;//表示余量
		
		double x=z*y;
		double θ=Math.toDegrees(Math.atan(r/h));
		double α=Math.toDegrees(Math.atan(x/2));
		

		if(α>θ){
			//do something
			System.out.println("不满足条件，针不能准确定位到孔内，请按照下述要求重新配置");
			System.out.println("根据程序计算，余量与凸台高度成正比，请选取适当的凸台高度之后让程序计算得出合适的余量或者选取适当的余量让程序得出合适的凸台高度");
			System.out.println("若您选择输入凸台高度，请输入1；选择输入余量，请输入2；");
			Scanner in=new Scanner(System.in);
			
			int choose=in.nextInt();
			if(choose==1&&choose==2){
				guidetest(choose,r,h);
			}else{
				System.out.println("请输入正确的选择");
				System.out.println("请您重新选择,输入凸台高度，请输入1；选择输入余量，请输入2；");
				Scanner in2=new Scanner(System.in);
				guidetest(in2.nextInt(),r,h);
			}
			
		}else if(α<θ){
			//do something
			System.out.println("满足条件！！");
		}else{
			System.out.println("此时处于极限位置，建议更改");
			System.out.println("请您重新选择输入,凸台高度，请输入1；选择输入余量，请输入2；");
			Scanner in3=new Scanner(System.in);
			guidetest(in3.nextInt(),r,h);
			
		}
		
	}
	
}
