class Person
{
	public void eat()
	{
		System.out.println("吃吃吃，就知道吃");
	}
	public void sleep()
	{
		System.out.println("睡睡睡，就知道睡觉");
	}
}
class Student extends Person{}

class Teacher extends Person{}

public class Learn_extends {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Student s=new Student();
			s.eat();
			s.sleep();
			System.out.println("---------");
			
			Teacher t=new Teacher();
			t.eat();
			t.sleep();
	}

}
