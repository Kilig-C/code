class Fu
{
	public int num =100;
	public Fu()
	{
		System.out.println("Fu");
	}
	public void show()
	{
		System.out.println("show Fu");
	}
	public static void function()
	{
		System.out.println("function Fu");
	}
}
class Zi extends Fu
{
	public int num =1000;
	public int num2=200;
	public Zi()
	{
		System.out.println("Zi");
	}
	public void show()
	{
		System.out.println("show zi");
	}
	public void method()
	{
		System.out.println("method zi");
	}
	public static void function()
	{
		System.out.println("function zi");
	}
	
}
public class DuoTaiFDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//Ҫ�и�������ָ���������
		Fu f=new Zi();
		System.out.println(f.num);
		//�Ҳ�������
		//System.out.println(f.num2);
		f.show();
		//�Ҳ�������
		//f.method();
		f.function();
		//�����ж�ĳ�������Ƿ�����ĳ����������
		//����ֵΪ��������
		if(f instanceof Zi)
		{
			System.out.println("f��Zi������");
		}
		else
		{
			System.out.println("f��f������");
		}
		//��̬�ı׶˲���ʹ���������еĹ���
		
		Zi z=(Zi)f;
		z.show();
		z.method();
	}
}
