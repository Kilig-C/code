class Creature
{
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal1 extends Creature
{
	public Animal1(String name)
	{
		System.out.println("Animal��һ�������Ĺ�������"+"�ö����nameΪ"+name);
	}
	public Animal1(String name,int age)
	{
		//ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�����������Ĺ�������"+"��ageΪ"+age);
	}
}
public class Wolf extends Animal1 
{
	public Wolf()
	{
		//��ʾ���ø��������������Ĺ�����
		super("��̫��",33);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Wolf();
	}

}
