/*
 * class Father{}
 * class Mother{}
 * class Son extends Father{} //正确的
 * class Son extends Father{},Monther{} //错误的
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
		// TODO 自动生成的方法存根
		Son s=new Son();
		s.method(); //使用父亲的
		s.show(); //使用爷爷的
	}

}
