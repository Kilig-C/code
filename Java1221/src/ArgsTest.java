/*
 * ��ʽ���������⣺
 * 	�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 *  �������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */
//��ʽ�����ǻ�������
class Demo
{
	public int sum(int a,int b)
	{
		return a+b;
	}
}

//��ʽ��������������
class Student
{
	int a;
	public void show()
	{
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo
{
	//����㿴����һ����������ʽ������һ�������ͣ��������ͣ�
	//���õ�ʱ�򣬰�main�����е�s�ĵ�ַ���ݵ������� Student s=n
	public void method(Student s)
	{
		s.a=100;
		s.show();
	}
}
public class ArgsTest {
	public static void main(String[] args) 
	{
		// TODO �Զ����ɵķ������
		Demo d=new Demo();
		int result = d.sum(10, 20);
		System.out.println("result:" + result);
		System.out.println("----------------");
		
		//��ʽ�������������͵ĵ���
		//������Ҫ����StudentDemo���е�method()����
		StudentDemo sd=new StudentDemo();
		//����ѧ������
		Student s1=new Student();
		System.out.println(s1.a);
		sd.method(s1); //��s�ĵ�ַ����������
		System.out.println(s1.a);
	}
}
