import java.util.Scanner;

public class CharacterCode {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int bigCount = 0; //�����д��ĸ����
		int smallCount = 0; //����Сд��ĸ����
		int numberCount = 0; //�������ָ���
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line=sc.nextLine();
		//���ַ���ת��Ϊ�ַ�����
		char[] chs = line.toCharArray();
		//�����ַ������ȡÿһ���ַ�
		for(int x=0;x<chs.length;x++)
		{
			char ch = chs[x];
			if(Character.isUpperCase(ch))
			{
				bigCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				smallCount++;
			}
			else if(Character.isDigit(ch))
			{
				numberCount++;
			}
		}
		System.out.println("��д��ĸ��"+ bigCount +"��");
		System.out.println("Сд��ĸ��"+ smallCount + "��");
		System.out.println("�����ַ���"+ numberCount +  "��");
	}

}
