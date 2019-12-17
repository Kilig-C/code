package hello;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化
		Scanner in=new Scanner(System.in);
		//输入投币金额
		System.out.print("请投币：");
		int amount = in.nextInt();
		if(amount>=30)
		{
			System.out.println("********************");
			System.out.println("* Java城际铁路专线  *");
			System.out.println("*  无指定座位票        *");
			System.out.println("*    票价30元           *");
			System.out.println("*******************");
			//计算并打印找零
			System.out.println("找零："+ (amount-30));
		}
		else
		{
			System.out.println("投币过少！");
		}
		
		
	} 

}
