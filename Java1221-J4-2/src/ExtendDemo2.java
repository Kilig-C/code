/*
 * class Father{}
 * class Mother{}
 * class Son extends Father{} //��ȷ��
 * class Son extends Father{},Monther{} //�����
 */
class GrandFather
{
	public void show()
	{
		System.out.println("I'm your grandfather");
	}
}
class Father extends GrandFather
{
	public void method()
	{
		System.out.println("I'm your father");
	}
}
class Son extends Father{}

public class ExtendDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Son s=new Son();
		s.method(); //ʹ�ø��׵�
		s.show(); //ʹ��үү��
	}

}
