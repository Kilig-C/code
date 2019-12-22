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
		// TODO 自动生成的方法存根
		//要有父类引用指向子类对象
		Fu f=new Zi();
		System.out.println(f.num);
		//找不到符号
		//System.out.println(f.num2);
		f.show();
		//找不到符号
		//f.method();
		f.function();
		//用来判断某个对象是否属于某种数据类型
		//返回值为布尔类型
		if(f instanceof Zi)
		{
			System.out.println("f是Zi的类型");
		}
		else
		{
			System.out.println("f是f的类型");
		}
		//多态的弊端不能使用子类特有的功能
		
		Zi z=(Zi)f;
		z.show();
		z.method();
	}
}
