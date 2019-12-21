/*
 * 形式参数的问题：
 * 	基本类型：形式参数的改变不影响实际参数
 *  引用类型：形式参数的改变直接影响实际参数
 */
//形式参数是基本类型
class Demo
{
	public int sum(int a,int b)
	{
		return a+b;
	}
}

//形式参数是引用类型
class Student
{
	int a;
	public void show()
	{
		System.out.println("我爱学习");
	}
}

class StudentDemo
{
	//如果你看到了一个方法的形式参数是一个类类型（引用类型）
	//调用的时候，把main方法中的s的地址传递到了这里 Student s=n
	public void method(Student s)
	{
		s.a=100;
		s.show();
	}
}
public class ArgsTest {
	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
		Demo d=new Demo();
		int result = d.sum(10, 20);
		System.out.println("result:" + result);
		System.out.println("----------------");
		
		//形式参数是引用类型的调用
		//需求：我要调用StudentDemo类中的method()方法
		StudentDemo sd=new StudentDemo();
		//创建学生对象
		Student s1=new Student();
		System.out.println(s1.a);
		sd.method(s1); //把s的地址给到了这里
		System.out.println(s1.a);
	}
}
