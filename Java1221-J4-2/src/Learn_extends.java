class Person
{
	public void eat()
	{
		System.out.println("�ԳԳԣ���֪����");
	}
	public void sleep()
	{
		System.out.println("˯˯˯����֪��˯��");
	}
}
class Student extends Person{}

class Teacher extends Person{}

public class Learn_extends {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Student s=new Student();
			s.eat();
			s.sleep();
			System.out.println("---------");
			
			Teacher t=new Teacher();
			t.eat();
			t.sleep();
	}

}
