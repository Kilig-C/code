package hello;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ʼ��
		Scanner in=new Scanner(System.in);
		//����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		if(amount>=30)
		{
			System.out.println("********************");
			System.out.println("* Java�Ǽ���·ר��  *");
			System.out.println("*  ��ָ����λƱ        *");
			System.out.println("*    Ʊ��30Ԫ           *");
			System.out.println("*******************");
			//���㲢��ӡ����
			System.out.println("���㣺"+ (amount-30));
		}
		else
		{
			System.out.println("Ͷ�ҹ��٣�");
		}
		
		
	} 

}
